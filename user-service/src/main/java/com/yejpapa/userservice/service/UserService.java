package com.yejpapa.userservice.service;

import com.yejpapa.userservice.model.User;
import com.yejpapa.userservice.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;

    }

    public Mono<User> byId(String id) {
        log.debug("service");
        return this.userRepository.findById(id);
    }

    public Flux<User> all() {
        return this.userRepository.findAll();
    }
}
