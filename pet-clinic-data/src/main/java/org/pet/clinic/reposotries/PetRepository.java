package org.pet.clinic.reposotries;

import org.pet.clinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long>{

}
