package org.pet.clinic.model;

import java.util.Set;

public interface VetService {
	
	Vet findById(long id);
	Vet save(Vet vet);
	Set<Vet> findAll();
}
