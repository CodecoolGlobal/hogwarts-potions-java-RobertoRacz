package com.codecool.hogwarts_potions.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Recipe {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @ManyToOne
    private Student maker;
    @OneToMany
    private List<Ingredient> ingredientList;
}
