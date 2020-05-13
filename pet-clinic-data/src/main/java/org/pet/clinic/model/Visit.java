package org.pet.clinic.model;

import java.time.LocalDate;

public class Visit extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Pet pet;
	private LocalDate date;
	private String descreption;
	public Pet getPet() {
		return pet;
	}
	public void setPet(Pet pet) {
		this.pet = pet;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getDescreption() {
		return descreption;
	}
	public void setDescreption(String descreption) {
		this.descreption = descreption;
	}
	
}
