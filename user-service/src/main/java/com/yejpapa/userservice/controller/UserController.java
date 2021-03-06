package com.yejpapa.userservice.controller;

import com.yejpapa.userservice.model.User;
import com.yejpapa.userservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public Mono<User> findById(@PathVariable String id) {
        log.debug("controller");
        return userService.byId(id);
    }

    @GetMapping
    public Flux<User> findAll() {
        return userService.all();
    }
}
