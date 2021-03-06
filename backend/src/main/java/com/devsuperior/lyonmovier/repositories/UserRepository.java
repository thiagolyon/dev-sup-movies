package com.devsuperior.lyonmovier.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.lyonmovier.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
}
