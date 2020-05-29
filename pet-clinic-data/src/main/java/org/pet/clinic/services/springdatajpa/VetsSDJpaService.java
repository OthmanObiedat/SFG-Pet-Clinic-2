package org.pet.clinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.pet.clinic.model.Vet;
import org.pet.clinic.reposotries.VetRepository;
import org.pet.clinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("springdatajpa")
public class VetsSDJpaService implements VetService {

	private VetRepository vetRepository;
	  
	public VetsSDJpaService(VetRepository vetRepository) {
		this.vetRepository = vetRepository;
	}
	
	@Override
	public Set<Vet> findAll() {
		HashSet<Vet> vets = new HashSet<>();
		 vetRepository.findAll().iterator().forEachRemaining(vets::add);
		 return vets;
	}

	@Override
	public Vet findById(Long id) {
		return vetRepository.findById(id).get();
	}

	@Override
	public Vet save(Vet object) {
		return vetRepository.save(object);
	}

	@Override
	public void delete(Vet object) {
		vetRepository.delete(object);
		
	}

	@Override
	public void deleteById(Long id) {
		vetRepository.deleteById(id);
		
	}

}
