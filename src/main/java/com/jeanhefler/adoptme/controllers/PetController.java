package com.jeanhefler.adoptme.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
	public ResponseEntity<List<Pet>> getAllPets(){
		return ResponseEntity.ok(petService.getAllPets());
	}
}
