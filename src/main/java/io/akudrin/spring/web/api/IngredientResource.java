package io.akudrin.spring.web.api;

import org.springframework.hateoas.ResourceSupport;

import io.akudrin.spring.Ingredient;
import io.akudrin.spring.Ingredient.Type;
import lombok.Getter;

public class IngredientResource extends ResourceSupport {
	@Getter
	private String name;
	@Getter
	private Type type;

	public IngredientResource(Ingredient ingredient) {
		this.name = ingredient.getName();
		this.type = ingredient.getType();
	}
}