package com.jeanhefler.adoptme.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jeanhefler.adoptme.entities.Owner;
import com.jeanhefler.adoptme.services.OwnerService;

@RestController
@RequestMapping("/owners")
public class OwnerController {
	@Autowired
	private OwnerService ownerService;
	
	@GetMapping
	List<Owner> getAllOwner(){
		return ownerService.getAllOwner();
	}
	@GetMapping("{id}")
	Owner getOwnerById(@PathVariable Long id) {
		return ownerService.getOwnerById(id);
	}
	@PostMapping
	Owner createOwner(@RequestBody Owner newOwner) {
		return ownerService.createOwner(newOwner);
	}
	@PutMapping("{id}")
	Owner updateOwner(@PathVariable Long id, @RequestBody Owner ownerBody) {
		return ownerService.updateOwner(ownerBody, id);
	}
	@DeleteMapping("{id}")
	void deleteOwner(@PathVariable Long id) {
		ownerService.deleteOwner(id);
	}
}
