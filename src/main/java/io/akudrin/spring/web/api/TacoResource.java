package io.akudrin.spring.web.api;

import java.util.Date;
import java.util.List;

import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.core.Relation;

import io.akudrin.spring.Taco;
import lombok.Getter;

@Relation(value="taco", collectionRelation="tacos")
public class TacoResource extends ResourceSupport {
	private static final IngredientResourceAssembler
	ingredientAssembler = new IngredientResourceAssembler();
	
	@Getter
	private final String name;
	@Getter
	private final Date createdAt;
	@Getter
	private final List<IngredientResource> ingredients;

	public TacoResource(Taco taco) {
		this.name = taco.getName();
		this.createdAt = taco.getCreatedAt();
		this.ingredients = ingredientAssembler.toResources(taco.getIngredients());
	}
}