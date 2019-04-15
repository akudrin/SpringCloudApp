package io.akudrin.spring.data;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import io.akudrin.spring.Order;
import io.akudrin.spring.User;

public interface OrderRepository extends CrudRepository<Order, Long> {
	List<Order> findByUserOrderByPlacedAtDesc(User user, Pageable pageable);

}