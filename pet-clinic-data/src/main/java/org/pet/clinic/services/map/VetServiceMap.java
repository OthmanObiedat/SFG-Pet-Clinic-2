package org.pet.clinic.services.map;

import java.util.Set;

import org.pet.clinic.model.Speciality;
import org.pet.clinic.model.Vet;
import org.pet.clinic.services.VetService;
import org.pet.clinic.services.VetSpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Service
@Profile({"default","map"})
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService{

	private final VetSpecialtyService vetSpecialtyService;
	public VetServiceMap(VetSpecialtyService vetSpecialtyService) {
		this.vetSpecialtyService = vetSpecialtyService;
	}
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
		if(object.getSpecialties().size() > 0) {
		object.getSpecialties().forEach(speciality->{
				if(speciality.getId() == null ) {
					Speciality saveSpecialty = vetSpecialtyService.save(speciality);
					speciality.setId(saveSpecialty.getId());
				}
			});
		}
		return super.save(object);
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
