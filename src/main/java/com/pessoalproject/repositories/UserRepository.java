package com.pessoalproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pessoalproject.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
