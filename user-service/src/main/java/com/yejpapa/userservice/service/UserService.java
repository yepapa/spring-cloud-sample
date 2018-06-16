package com.yejpapa.userservice.service;

import com.yejpapa.userservice.model.User;
import com.yejpapa.userservice.repository.UserRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;

    }

    public Mono<User> byId(String id) {
        return this.userRepository.findById(id);
    }

    public Flux<User> all() {
        return this.userRepository.findAll();
    }
}
