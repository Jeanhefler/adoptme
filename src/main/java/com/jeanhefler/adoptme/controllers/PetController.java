package com.jeanhefler.adoptme.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jeanhefler.adoptme.entities.Pet;
import com.jeanhefler.adoptme.services.PetService;

@RestController
@RequestMapping("/pets")
public class PetController {
	@Autowired
	private PetService petService;
	
	@GetMapping
	List<Pet> getAllPets()  throws Exception {
		return petService.getAllPets();
		
	}
	@GetMapping("{id}")
	public Pet getPetById(@PathVariable Long id) {
		return petService.getPetById(id);
	}
	@PostMapping
	public Pet createPet(@RequestBody Pet pet) {
		return petService.createPet(pet);
	}
	@PutMapping("/{id}")
	public ResponseEntity<Pet> updatePet(@PathVariable Long id, @RequestBody Pet pet){
		return ResponseEntity.ok(petService.updatePet(id, pet));
	}
	@DeleteMapping("/{id}")
	public void deletePetById(@PathVariable Long id) {
		petService.deletePet(id);
	}
}
