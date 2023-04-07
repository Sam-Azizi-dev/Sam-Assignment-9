package com.Assignments9.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.Assignments9.domain.RecipePOJO;

@Service
public class RecipeService {
	private List<RecipePOJO> recipes = new ArrayList<>();
		
	public RecipeService() throws Exception {
		this.recipes = new FileService().parseRecipes();
	}

	public List<RecipePOJO> getAllRecipes() {
		return this.recipes;
	}

	public List<RecipePOJO> getGlutenFreeRecipes() {
		return this.recipes.stream().filter(recipe -> recipe.getGlutenFree())
				.collect(Collectors.toList());
	}

	public List<RecipePOJO> getVeganRecipes() {
		return this.recipes.stream().filter(recipe -> recipe.getVegan())
				.collect(Collectors.toList());
	}

	public List<RecipePOJO> getVeganAndGlutenFreeRecipes() {
		return this.recipes.stream()
				.filter(recipe -> recipe.getVegan() && recipe.getGlutenFree())
				.collect(Collectors.toList());
	}

	public List<RecipePOJO> getVegetarianRecipes() {
		return this.recipes.stream().filter(recipe -> recipe.getVegetarian())
				.collect(Collectors.toList());
	}
}
