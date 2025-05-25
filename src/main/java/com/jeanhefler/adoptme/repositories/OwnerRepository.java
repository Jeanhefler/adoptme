package com.jeanhefler.adoptme.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeanhefler.adoptme.entities.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Long>{

}
