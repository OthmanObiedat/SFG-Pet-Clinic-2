package org.pet.clinic.services.map;

import java.util.Set;

import org.pet.clinic.model.Pet;
import org.pet.clinic.services.CrudService;
import org.pet.clinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Service
@Profile({"default","map"})
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}

	@Override
	public Pet save(Pet object) {
		return super.save( object);
	}

	@Override
	public void delete(Pet object) {
		super.delete(object);

	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);

	}

}
