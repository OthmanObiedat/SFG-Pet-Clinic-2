package org.pet.clinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.pet.clinic.model.Speciality;
import org.pet.clinic.reposotries.SpecialityRepository;
import org.pet.clinic.services.VetSpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("springdatajpa")
public class VetSpecialtySDJpaService implements VetSpecialtyService{

	private final SpecialityRepository specialityRepository;
	
	public VetSpecialtySDJpaService(SpecialityRepository specialityRepository ) {
		this.specialityRepository = specialityRepository;
	}
	
	@Override
	public Set<Speciality> findAll() {
		HashSet<Speciality> specialities = new HashSet<>();
		 specialityRepository.findAll().iterator().forEachRemaining(specialities::add);
		return specialities;
	}

	@Override
	public Speciality findById(Long id) {
		return specialityRepository.findById(id).get();
	}

	@Override
	public Speciality save(Speciality object) {
		return specialityRepository.save(object);
	}

	@Override
	public void delete(Speciality object) {
		specialityRepository.delete(object);		
	}

	@Override
	public void deleteById(Long id) {
		specialityRepository.deleteById(id);
		
	}

	
}
