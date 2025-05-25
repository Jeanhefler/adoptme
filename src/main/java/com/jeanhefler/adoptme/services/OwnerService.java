package com.jeanhefler.adoptme.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeanhefler.adoptme.entities.Owner;
import com.jeanhefler.adoptme.repositories.OwnerRepository;

@Service
public class OwnerService {

	@Autowired
	private OwnerRepository ownerRepository;
	
	public List<Owner> getAllOwner(){
		return ownerRepository.findAll();
	}
	public Owner getOwnerById(Long id) {
		Optional<Owner> owner = ownerRepository.findById(id);
		return owner.orElseThrow(() -> new RuntimeException("Owner not found"));
	}
	public Owner createOwner(Owner newOwner) {
		return ownerRepository.save(newOwner);
	}
	public Owner updateOwner(Owner ownerBody, Long id) {
		Owner owner = getOwnerById(id);
		owner.setName(ownerBody.getName());
		owner.setEmail(ownerBody.getEmail());
		return ownerRepository.save(owner);
	}
	public void deleteOwner(Long id) {
		ownerRepository.deleteById(id);
	}
}
