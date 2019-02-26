package io.akudrin.spring.data;

import io.akudrin.spring.Order;
import io.akudrin.spring.Taco;

public interface OrderRepository {
	Order save(Taco design);

}
