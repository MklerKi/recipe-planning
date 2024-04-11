package com.project.recipeplanning.recipe.repository.entity;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RecipeRepo {

    public List<Recipe> getAllRecipes() {
        return List.of(
                Recipe.builder()
                        .name("First recipe")
                        .instruction("bla bla bla")
                        .cookingTime("50 min")
                        .difficultyLevel(3)
                        .numberOfPortions(6)
                        .rating(0)
                        .build(),
                Recipe.builder()
                        .name("Second recipe")
                        .instruction("ahoy ahoy")
                        .cookingTime("20 min")
                        .difficultyLevel(1)
                        .numberOfPortions(3)
                        .rating(0)
                        .build(),
                Recipe.builder()
                        .name("Third recipe")
                        .instruction("aha aha aha")
                        .cookingTime("2 hours")
                        .difficultyLevel(5)
                        .numberOfPortions(6)
                        .rating(0)
                        .build());
    }
}
