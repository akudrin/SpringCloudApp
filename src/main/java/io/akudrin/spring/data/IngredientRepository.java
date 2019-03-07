package io.akudrin.spring.data;

import org.springframework.data.repository.CrudRepository;

import io.akudrin.spring.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {

}
