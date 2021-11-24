package com.pessoalproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pessoalproject.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
