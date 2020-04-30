package org.pet.clinic.services;

import java.util.Set;

import org.pet.clinic.model.Owner;
import org.pet.clinic.model.Pet;

public interface PetService {

	Pet findById(long id);
	Owner save(Pet pet);
	Set<Pet> findAll();
}
