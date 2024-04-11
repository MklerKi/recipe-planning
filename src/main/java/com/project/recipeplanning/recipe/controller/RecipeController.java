package com.project.recipeplanning.recipe.controller;

import com.project.recipeplanning.recipe.repository.entity.Recipe;
import com.project.recipeplanning.recipe.service.RecipeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("recipes")
@RequiredArgsConstructor
public class RecipeController {

    private final RecipeService recipeService;

    @GetMapping()
    public List<Recipe> getAllRecipes() {
        return recipeService.getAllRecipes();
    }
}
