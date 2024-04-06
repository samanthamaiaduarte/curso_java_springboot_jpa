package com.samanthamaiaduarte.curso_java.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samanthamaiaduarte.curso_java.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
