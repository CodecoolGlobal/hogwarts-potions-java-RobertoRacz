package com.codecool.hogwarts_potions.persistence.repository;

import com.codecool.hogwarts_potions.persistence.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
