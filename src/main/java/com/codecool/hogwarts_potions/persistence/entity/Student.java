package com.codecool.hogwarts_potions.persistence.entity;

import com.codecool.hogwarts_potions.model.HouseType;
import com.codecool.hogwarts_potions.model.PetType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {

    @Id
    @GeneratedValue
    private Long studentId;
    private String name;
    private HouseType houseType;
    private PetType petType;
    @OneToOne
    private Room room;
}
