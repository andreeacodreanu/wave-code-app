package com.project.repository.auth;

import com.project.model.auth.ERole;
import com.project.model.auth.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}
