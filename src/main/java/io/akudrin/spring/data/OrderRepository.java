package io.akudrin.spring.data;

import org.springframework.data.repository.CrudRepository;

import io.akudrin.spring.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {

}