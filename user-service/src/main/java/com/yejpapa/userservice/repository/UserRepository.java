package com.yejpapa.userservice.repository;

import com.yejpapa.userservice.model.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface UserRepository extends ReactiveMongoRepository<User, String> {
}
