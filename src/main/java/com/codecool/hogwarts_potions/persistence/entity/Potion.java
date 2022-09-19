package com.codecool.hogwarts_potions.persistence.entity;

import com.codecool.hogwarts_potions.model.BrewingStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Potion {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @OneToMany
    private List<Ingredient> ingredientList;
    private BrewingStatus brewingStatus;
    @OneToOne
    private Recipe recipe;

    @Override
    public String toString() {
        return "Potion{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ingredientList=" + ingredientList +
                ", brewingStatus=" + brewingStatus +
                ", recipe=" + recipe +
                '}';
    }
}
