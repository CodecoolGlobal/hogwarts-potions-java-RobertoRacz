package com.codecool.hogwarts_potions.persistence.repository;

import com.codecool.hogwarts_potions.persistence.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
