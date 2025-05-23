package com.jeanhefler.adoptme.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Embeddable
public class AdoptionPk {
	@OneToOne
	@JoinColumn(name = "pet_id")
	private Pet pet;
	@ManyToOne
	@JoinColumn(name = "owner_id")
	private Owner owner;
	
	AdoptionPk() {
	}
	public AdoptionPk(Pet pet, Owner owner) {
		super();
		this.pet = pet;
		this.owner = owner;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	
}
