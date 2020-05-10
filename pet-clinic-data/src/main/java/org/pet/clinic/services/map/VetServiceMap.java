package org.pet.clinic.services.map;

import java.util.Set;

import org.pet.clinic.model.Vet;
import org.pet.clinic.services.CrudService;
import org.pet.clinic.services.VetService;
import org.springframework.stereotype.Service;
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService{

	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}

	@Override
	public Vet save(Vet object) {
		return super.save(object.getId(), object);
	}

	@Override
	public void delete(Vet object) {
		super.delete(object);
		
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
		
	}

}
