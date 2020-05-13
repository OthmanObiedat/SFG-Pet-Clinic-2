package org.pet.clinic.services.map;

import java.util.Set;

import org.pet.clinic.model.Speciality;
import org.pet.clinic.services.VetSpecialtyService;
import org.springframework.stereotype.Service;

@Service
public class VetSpecialityMapService extends AbstractMapService<Speciality, Long>implements VetSpecialtyService  {

	@Override
	public Set<Speciality> findAll() {
		return super.findAll();
	}

	@Override
	public Speciality findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Speciality save(Speciality object) {
		return super.save(object);
	}

	@Override
	public void delete(Speciality object) {
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}
