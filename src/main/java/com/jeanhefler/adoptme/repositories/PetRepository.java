package com.jeanhefler.adoptme.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeanhefler.adoptme.entities.Pet;

public interface PetRepository extends JpaRepository<Pet, Long> {
	
}
