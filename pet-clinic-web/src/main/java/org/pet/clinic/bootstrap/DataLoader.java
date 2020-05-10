package org.pet.clinic.bootstrap;

import org.pet.clinic.model.Owner;
import org.pet.clinic.model.Vet;
import org.pet.clinic.services.OwnerService;
import org.pet.clinic.services.VetService;
import org.pet.clinic.services.map.OwnerServiceMap;
import org.pet.clinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner{

	private OwnerService ownerService;
	private VetService vetService;
	
	public DataLoader(OwnerService ownerService,VetService vetService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
	}
	@Override
	public void run(String... args) throws Exception {
		
		Owner owner1 = new Owner();
		owner1.setFirstName("Owner1 FirstName");
		owner1.setLastName("Owner1 LastName");
		
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setFirstName("Owner2 FirstName");
		owner2.setLastName("Owner2 LastName");
		
		ownerService.save(owner2);
		
		System.out.println("Owner loaded.....");
		
		
		Vet vet1 = new Vet();
		vet1.setFirstName("vet1 FirstName");
		vet1.setLastName("vet1 LastName");
		
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setFirstName("vet2 FirstName");
		vet2.setLastName("vet2 LastName");
		
		vetService.save(vet2);
		
		System.out.println("Vet loaded.....");
		
		
	}

}
