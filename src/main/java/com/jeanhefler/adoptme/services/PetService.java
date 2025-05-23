package com.jeanhefler.adoptme.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeanhefler.adoptme.entities.Pet;
import com.jeanhefler.adoptme.repositories.PetRepository;

@Service
public class PetService {
	@Autowired
	private PetRepository petRepository;
	
	public List<Pet> getAllPets(){
		return petRepository.findAll();
	}
	public Pet createPet(Pet pet) {
		return petRepository.save(pet);
	}
}
