package com.cruz.apph2.repository;

import com.cruz.apph2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
