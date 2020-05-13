package org.pet.clinic.services.map;

import java.util.Set;

import org.pet.clinic.model.Owner;
import org.pet.clinic.model.Pet;
import org.pet.clinic.services.CrudService;
import org.pet.clinic.services.OwnerService;
import org.springframework.stereotype.Service;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

	private final PetServiceMap petServiceMap;
	private final PetTypeServiceMap petTypeServiceMap;

	public OwnerServiceMap(PetServiceMap petServiceMap, PetTypeServiceMap petTypeServiceMap) {
		this.petServiceMap = petServiceMap;
		this.petTypeServiceMap = petTypeServiceMap;
	}

	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}

	@Override
	public Owner save(Owner object) {
		return saveOwner(object);
	}

	private Owner saveOwner(Owner object) {
		if (object != null) {
			if (object.getPets() != null) {
				object.getPets().forEach(pet -> {
					if (pet.getPetType() != null) {
						if (pet.getPetType().getId() == null) {
							petTypeServiceMap.save(pet.getPetType());
						}
					}else {
						throw new RuntimeException("Pet Type is Requered");
					}
					if(pet.getId() == null ) {
						Pet savedPet = petServiceMap.save(pet);
						pet.setId(savedPet.getId());
					}
				});
			}
			return super.save(object);

		}else {
			return null;
		}
	}

	@Override
	public void delete(Owner object) {
		super.delete(object);

	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

}
