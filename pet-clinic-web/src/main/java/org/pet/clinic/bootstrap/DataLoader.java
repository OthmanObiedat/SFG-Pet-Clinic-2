package org.pet.clinic.bootstrap;

import java.time.LocalDate;

import org.pet.clinic.model.Owner;
import org.pet.clinic.model.Pet;
import org.pet.clinic.model.PetType;
import org.pet.clinic.model.Speciality;
import org.pet.clinic.model.Vet;
import org.pet.clinic.services.OwnerService;
import org.pet.clinic.services.PetTypeService;
import org.pet.clinic.services.VetService;
import org.pet.clinic.services.VetSpecialtyService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner{

	private OwnerService ownerService;
	private VetService vetService;
	private PetTypeService petTypeService;
	private VetSpecialtyService vetSpecialtyService;
	
	public DataLoader(OwnerService ownerService,VetService vetService,PetTypeService petTypeService,VetSpecialtyService vetSpecialtyService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
		this.vetSpecialtyService = vetSpecialtyService;
	}
	@Override
	public void run(String... args) throws Exception {

		if(petTypeService.findAll().size()==0) {
			loadData();
		}
		
	}
	private void loadData() {
		PetType dog = new PetType();
		dog.setName("Dog");
		PetType savedDog = petTypeService.save(dog);
		
		PetType dog1 = new PetType();
		dog1.setName("Dog1");
		PetType savedDog1 = petTypeService.save(dog1);
		
		Speciality radiology = new Speciality();
		radiology.setDescreption("Radiology");
		Speciality savedRadiology = vetSpecialtyService.save(radiology);
		
		Speciality surgery = new Speciality();
		surgery.setDescreption("Surgery");
		Speciality savedSurgery = vetSpecialtyService.save(surgery);
		
		Speciality dentistry = new Speciality();
		dentistry.setDescreption("Dentistry");
		Speciality savedDentistry = vetSpecialtyService.save(dentistry);
		
		Owner owner = new Owner();
		owner.setFirstName("Owner FirstName");
		owner.setLastName("Owner LastName");
		owner.setAddress("123 jbiha");
		owner.setCity("Amman");
		owner.setTelephone("07999998");
		
		Pet pet = new Pet();
		pet.setName("Pet");
		pet.setPetType(savedDog);
		pet.setOwner(owner);
		pet.setBirthDate(LocalDate.now());
		owner.getPets().add(pet);
		
		
		ownerService.save(owner);
		
		Owner owner1 = new Owner();
		owner1.setFirstName("Owner1 FirstName");
		owner1.setLastName("Owner1 LastName");
		owner1.setAddress("456 jbiha");
		owner1.setCity("Amman");
		owner1.setTelephone("079999");
		
		Pet pet1 = new Pet();
		pet1.setName("Pet1");
		pet1.setPetType(savedDog1);
		pet1.setOwner(owner1);
		pet1.setBirthDate(LocalDate.now().minusYears(3));
		owner.getPets().add(pet1);
		
		ownerService.save(owner1);
		
		System.out.println("Owner loaded.....");
		
		
		Vet vet1 = new Vet();
		vet1.setFirstName("vet1 FirstName");
		vet1.setLastName("vet1 LastName");
		vet1.getSpecialties().add(savedSurgery);
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setFirstName("vet2 FirstName");
		vet2.setLastName("vet2 LastName");
		vet2.getSpecialties().add(savedRadiology);
		vetService.save(vet2);
		
		System.out.println("Vet loaded.....");
	}

}
