package com.codecool.hogwarts_potions.persistence.repository;

import com.codecool.hogwarts_potions.persistence.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
