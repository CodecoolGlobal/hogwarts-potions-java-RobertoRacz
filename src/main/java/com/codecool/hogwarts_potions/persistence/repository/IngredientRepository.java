package com.codecool.hogwarts_potions.persistence.repository;

import com.codecool.hogwarts_potions.persistence.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}
