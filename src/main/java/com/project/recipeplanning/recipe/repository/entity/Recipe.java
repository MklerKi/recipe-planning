package com.project.recipeplanning.recipe.repository.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Recipe {
    private String name;
    // ingredients
    String instruction;
    String cookingTime;
    double difficultyLevel;
    double numberOfPortions;
    double rating;
    // category -- what in here?
    // cuisine
    // key names
    // type(basic, vegan, lactose free, sugar free, ...)
}
