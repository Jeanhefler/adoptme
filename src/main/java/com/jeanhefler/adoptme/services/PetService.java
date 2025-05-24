package com.jeanhefler.adoptme.services;

import java.util.List;
import java.util.Optional;

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
	public Pet getPetById(Long id) {
		Optional<Pet> pet = petRepository.findById(id);
		return pet.orElseThrow(() -> new RuntimeException("Pet not found"));
	}
	public Pet createPet(Pet pet) {
		return petRepository.save(pet);
	}
	public Pet updatePet(Long id, Pet petBody) {
		Pet pet = getPetById(id);
		pet.setName(petBody.getName());
		pet.setType(petBody.getType());
		pet.setSex(petBody.getSex());
		pet.setWeight(petBody.getWeight());
		pet.setImage(petBody.getImage());
		pet.setAvailable(petBody.isAvailable());
		return petRepository.save(pet);
	}
	public void deletePet(Long id) {
		petRepository.deleteById(id);
	}
}
