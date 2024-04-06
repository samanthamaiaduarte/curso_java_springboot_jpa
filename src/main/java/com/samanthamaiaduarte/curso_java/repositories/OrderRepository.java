package com.samanthamaiaduarte.curso_java.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samanthamaiaduarte.curso_java.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
