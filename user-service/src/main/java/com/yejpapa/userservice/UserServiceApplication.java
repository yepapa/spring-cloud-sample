package com.yejpapa.userservice;

import com.yejpapa.userservice.model.User;
import com.yejpapa.userservice.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@SpringBootApplication
public class UserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }
}

@Component
class DataAppInitializer {
    private final UserRepository userRepository;

    DataAppInitializer(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @EventListener
    public void run(ApplicationReadyEvent event) {
        this.userRepository
                .deleteAll()
                .thenMany(
                        Flux.just("ye1", "ye2")
                                .flatMap(userName -> this.userRepository.save(new User(userName))))
                .subscribe(null, null,
                        () -> this.userRepository.findAll().subscribe(System.out::println));
    }
}
