package com.samanthamaiaduarte.curso_java.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samanthamaiaduarte.curso_java.entities.OrderItem;
import com.samanthamaiaduarte.curso_java.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
