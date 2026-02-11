package com.smartrent.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartrent.api.model.Role;
import com.smartrent.api.model.RoleType;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleType name);

}
