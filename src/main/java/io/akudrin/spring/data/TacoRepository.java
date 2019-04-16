package io.akudrin.spring.data;

import org.springframework.data.repository.PagingAndSortingRepository;

import io.akudrin.spring.Taco;

public interface TacoRepository extends PagingAndSortingRepository<Taco, Long> {

}