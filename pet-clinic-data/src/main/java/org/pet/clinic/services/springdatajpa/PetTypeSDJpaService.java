package org.pet.clinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.pet.clinic.model.PetType;
import org.pet.clinic.reposotries.PetTypeRepository;
import org.pet.clinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("springdatajpa")
public class PetTypeSDJpaService implements PetTypeService{

	private final PetTypeRepository petTypeRepository;
	
	
	public PetTypeSDJpaService(PetTypeRepository petTypeRepository) {
		this.petTypeRepository = petTypeRepository;
	}
	
	@Override
	public Set<PetType> findAll() {
		
		HashSet<PetType> petTypes = new HashSet<>();
		petTypeRepository.findAll().iterator().forEachRemaining(petTypes::add);
		
		return petTypes;
	}

	@Override
	public PetType findById(Long id) {
		return petTypeRepository.findById(id).get();
	}

	@Override
	public PetType save(PetType object) {
		return petTypeRepository.save(object);
	}

	@Override
	public void delete(PetType object) {
		petTypeRepository.delete(object);
		
	}

	@Override
	public void deleteById(Long id) {
		petTypeRepository.deleteById(id);		
	}

}
