package io.akudrin.spring.data;

import io.akudrin.spring.Order;


public interface OrderRepository {
	Order save(Order order);

}
