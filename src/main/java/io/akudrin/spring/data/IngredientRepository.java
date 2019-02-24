package io.akudrin.spring.data;

import io.akudrin.spring.Ingredient;

public interface IngredientRepository {
	
	Iterable<Ingredient> findAll();
	Ingredient findOne(String id);
	Ingredient save(Ingredient ingredient);

}
