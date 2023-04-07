package com.Assignments9.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Assignments9.domain.RecipePOJO;
import com.Assignments9.service.RecipeService;

@RestController
public class RecipeController {

	private final RecipeService recipeService;

	public RecipeController(RecipeService recipeService) {
		this.recipeService = recipeService;
	}

	@GetMapping("/gluten-free")
	public List<RecipePOJO> getGlutenFreeRecipes() {
		return recipeService.getGlutenFreeRecipes();
	}

	@GetMapping("/vegan")
	public List<RecipePOJO> getVeganRecipes() {
		return recipeService.getVeganRecipes();
	}

	@GetMapping("/vegan-and-gluten-free")
	public List<RecipePOJO> getVeganAndGlutenFreeRecipes() {
		return recipeService.getVeganAndGlutenFreeRecipes();
	}

	@GetMapping("/vegetarian")
	public List<RecipePOJO> getVegetarianRecipes() {
		return recipeService.getVegetarianRecipes();
	}

	@GetMapping("/all-recipes")
	public List<RecipePOJO> getAllRecipes() throws Exception {
		return recipeService.getAllRecipes();
	}
}
