package com.codecool.hogwarts_potions.controller;

import com.codecool.hogwarts_potions.persistence.entity.Potion;
import com.codecool.hogwarts_potions.service.PotionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/potions")
public class PotionController {

    PotionService potionService;

    public PotionController(PotionService potionService) {
        this.potionService = potionService;
    }

    @GetMapping
    public List<Potion> getAll() {
        return potionService.getAllPotions();
    }

    @PostMapping
    public Potion addPotion(@RequestBody Potion potion) {
        return potionService.addPotion(potion);
    }
}
