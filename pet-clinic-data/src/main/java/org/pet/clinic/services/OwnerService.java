package org.pet.clinic.services;

import java.util.Set;

import org.pet.clinic.model.Owner;

public interface OwnerService {
	
	Owner findById(long id);
	Owner save(Owner owner);
	Set<Owner> findAll();
	Owner findByLastName(String lastName);
	
}
