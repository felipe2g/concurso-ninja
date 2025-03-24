package com.concursoninja.demo.repositories;

import com.concursoninja.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}
