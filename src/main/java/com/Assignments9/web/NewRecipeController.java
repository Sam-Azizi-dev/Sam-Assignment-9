package com.Assignments9.web;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Assignments9.domain.RecipePOJO;
import com.Assignments9.service.FileService;

@RestController
public class NewRecipeController {
	// This is another way I tryed to see if this works or not . looks like its work and dosn't need RecipeService class any more.
	// but I comment it couse makes program duplicating eith same endpoints 
//	@Autowired
//	FileService fileService;
//	
//	@GetMapping("/gluten-free")
//	public List<RecipePOJO> getGlutenFreeRecipes() throws Exception {
//		return fileService.parseRecipes()
//			.stream()
//			.filter(RecipePOJO::getGlutenFree)
//			.collect(Collectors.toList());
//	}
//	
//	@GetMapping("/vegan")
//	public List<RecipePOJO> getVeganRecipes() throws Exception {
//		return fileService.parseRecipes()
//			.stream()
//			.filter(RecipePOJO::getVegan)
//			.collect(Collectors.toList());
//	}
//	
//	@GetMapping("/vegan-and-gluten-free")
//	public List<RecipePOJO> getVeganAndGlutenFreeRecipes() throws Exception {
//		return fileService.parseRecipes()
//			.stream()
//			.filter(recipe -> recipe.getVegan() && recipe.getGlutenFree())
//			.collect(Collectors.toList());
//	}
//	
//	@GetMapping("/vegetarian")
//	public List<RecipePOJO> getVegetarianRecipes() throws Exception {
//		return fileService.parseRecipes()
//			.stream()
//			.filter(RecipePOJO::getVegetarian)
//			.collect(Collectors.toList());
//	}
//	
//	@GetMapping("/all-recipes")
//	public List<RecipePOJO> getAllRecipes() throws Exception {
//		return fileService.parseRecipes();
//	}
}
