package org.pet.clinic.services.map;

import java.util.Set;

import org.pet.clinic.model.PetType;
import org.pet.clinic.services.PetTypeService;
import org.springframework.stereotype.Service;

@Service
public class PetTypeServiceMap extends AbstractMapService<PetType, Long> implements PetTypeService{

	@Override
	public Set<PetType> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PetType findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PetType save(PetType object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(PetType object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

}
