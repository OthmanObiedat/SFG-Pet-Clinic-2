package org.pet.clinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.pet.clinic.model.Owner;
import org.pet.clinic.reposotries.OwnerRepository;
import org.pet.clinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Service
@Profile("springdatajpa")
public class OwnerSDJpaService implements OwnerService{

	private final OwnerRepository ownerRepository;

	public OwnerSDJpaService(OwnerRepository ownerRepository) {
		this.ownerRepository = ownerRepository;
	}
	@Override
	public Set<Owner> findAll() {
		Set<Owner> owners = new HashSet<Owner>();
		ownerRepository.findAll().iterator().forEachRemaining(owners::add);
		return owners;
	}

	@Override
	public Owner findById(Long id) {
		Optional<Owner> owner = ownerRepository.findById(id);
		if(owner.isPresent()) {
			return owner.get();
		}
		return null;
	}

	@Override
	public Owner save(Owner object) {
		return ownerRepository.save(object);
	}

	@Override
	public void delete(Owner object) {
		ownerRepository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		ownerRepository.deleteById(id);
		
	}

	@Override
	public Owner findByLastName(String lastName) {
		return ownerRepository.findByLastName(lastName);
	}

}
