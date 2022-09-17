package com.codecool.hogwarts_potions.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Room {

    @Id
    @GeneratedValue
    private Long id;
    private Integer capacity;
    @OneToMany
    private Set<Student> resident;
}
