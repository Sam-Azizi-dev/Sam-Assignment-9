package com.Assignments9.service;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Service;

import com.Assignments9.domain.RecipePOJO;

@Service
public class FileService {

	private static final String[] HEADERS = {"Cooking Minutes", "Dairy Free", "Gluten Free", "Instructions", "Preparation Minutes", "Price Per Serving", "Ready In Minutes", "Servings", "Spoonacular Score", "Title", "Vegan", "Vegetarian"};
	public List<RecipePOJO> parseRecipes() throws Exception {
		FileReader fileReader = new FileReader("recipes.txt");

		CSVFormat csvFormat = CSVFormat.DEFAULT
			    .withHeader(HEADERS)
			    .withSkipHeaderRecord(true)
			    .withEscape('\\')
			    .withIgnoreSurroundingSpaces(true);

		Iterable<CSVRecord> csvParser = csvFormat.parse(fileReader);
		List<RecipePOJO> recipes = new ArrayList<>();
		for (CSVRecord record : csvParser) {
			RecipePOJO recipe = new RecipePOJO();
			recipe.setCookingMinutes(Integer.parseInt(record.get("Cooking Minutes")));
			recipe.setDairyFree(Boolean.parseBoolean(record.get("Dairy Free")));
			recipe.setGlutenFree(Boolean.parseBoolean(record.get("Gluten Free")));
			recipe.setInstructions(record.get("Instructions"));
			recipe.setPreparationMinutes(Double.parseDouble(record.get("Preparation Minutes")));
			recipe.setPricePerServing(Double.parseDouble(record.get("Price Per Serving")));
			recipe.setReadyInMinutes(Integer.parseInt(record.get("Ready In Minutes")));
			recipe.setServings(Integer.parseInt(record.get("Servings")));
			recipe.setSpoonacularScore(Double.parseDouble(record.get("Spoonacular Score")));
			recipe.setTitle(record.get("Title"));
			recipe.setVegan(Boolean.parseBoolean(record.get("Vegan")));
			recipe.setVegetarian(Boolean.parseBoolean(record.get("Vegetarian")));

			recipes.add(recipe);
		}

		return recipes;
	}
}
