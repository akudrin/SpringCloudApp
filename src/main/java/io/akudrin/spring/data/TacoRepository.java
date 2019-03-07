package io.akudrin.spring.data;

import org.springframework.data.repository.CrudRepository;

import io.akudrin.spring.Taco;

public interface TacoRepository extends CrudRepository<Taco, Long> {

}