package com.jeanhefler.adoptme.entities;

import java.time.LocalDate;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Adoption {
	@EmbeddedId
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private AdoptionPk id = new AdoptionPk();
	private LocalDate adoptionDate;
	
	Adoption(){
	}
	public Adoption(AdoptionPk id, LocalDate adoptionDate) {
		super();
		this.id = id;
		this.adoptionDate = adoptionDate;
	}
	
	public AdoptionPk getId() {
		return id;
	}
	public void setId(AdoptionPk id) {
		this.id = id;
	}
	public LocalDate getAdoptionDate() {
		return adoptionDate;
	}
	public void setAdoptionDate(LocalDate adoptionDate) {
		this.adoptionDate = adoptionDate;
	}
}
