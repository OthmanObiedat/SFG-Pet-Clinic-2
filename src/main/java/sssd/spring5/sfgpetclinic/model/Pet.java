package sssd.spring5.sfgpetclinic.model;

import java.time.LocalDate;

import sssd.spring5.sfgpetclinic.model.Util.PetType;

public class Pet {

	private PetType petType;
	private Owner owner;
	private LocalDate birthDate;
	
	 public Pet() {
		// TODO Auto-generated constructor stub
	 }
	 
	 public void setPetType(PetType petType) {
		this.petType = petType;
	 }
	 public void setOwner(Owner owner) {
		this.owner = owner;
	 }
	 public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	 }
	 public PetType getPetType() {
		return petType;
	}
	 public Owner getOwner() {
		return owner;
	}
	 public LocalDate getBirthDate() {
		return birthDate;
	}
	 
	 
}
