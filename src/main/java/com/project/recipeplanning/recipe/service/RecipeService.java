package com.project.recipeplanning.recipe.service;

import com.project.recipeplanning.recipe.repository.entity.Recipe;
import com.project.recipeplanning.recipe.repository.entity.RecipeRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RecipeService {

    private final RecipeRepo recipeRepo;

    public List<Recipe> getAllRecipes() {
        return recipeRepo.getAllRecipes();
    }
}
