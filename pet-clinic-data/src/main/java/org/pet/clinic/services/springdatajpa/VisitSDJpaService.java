package org.pet.clinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.pet.clinic.model.Visit;
import org.pet.clinic.reposotries.VisitRepository;
import org.pet.clinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("springdatajpa")
public class VisitSDJpaService implements VisitService{

	private final VisitRepository visitRepository;
	
	public VisitSDJpaService(VisitRepository visitRepository) {
		this.visitRepository = visitRepository;
	}
	
	@Override
	public Set<Visit> findAll() {
		HashSet<Visit>visits = new HashSet<>();
		visitRepository.findAll().iterator().forEachRemaining(visits::add);
		return visits;
	}

	@Override
	public Visit findById(Long id) {
		return visitRepository.findById(id).get();
	}

	@Override
	public Visit save(Visit object) {
		return visitRepository.save(object);
	}

	@Override
	public void delete(Visit object) {
		visitRepository.delete(object);
		
	}

	@Override
	public void deleteById(Long id) {
		visitRepository.deleteById(id);
	}

}
