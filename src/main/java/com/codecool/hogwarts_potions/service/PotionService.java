package com.codecool.hogwarts_potions.service;

import com.codecool.hogwarts_potions.persistence.entity.Potion;
import com.codecool.hogwarts_potions.persistence.repository.PotionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PotionService {

    PotionRepository potionRepository;

    public PotionService(PotionRepository potionRepository) {
        this.potionRepository = potionRepository;
    }
    public List<Potion> getAllPotions() {
        return potionRepository.findAll();
    }

    public Potion addPotion(Potion potion) {
        System.out.println("--------THIS IS POTION-------" + potion);
        return potionRepository.save(potion);
    }
}
