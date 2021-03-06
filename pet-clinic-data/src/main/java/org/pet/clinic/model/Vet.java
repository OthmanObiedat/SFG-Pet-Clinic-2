package org.pet.clinic.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "vets")
public class Vet extends Person{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "vets_specialities",joinColumns = @JoinColumn(name = "vet_id"),
	inverseJoinColumns = @JoinColumn(name = "speciality_id"))
	private Set<Speciality>specialties = new HashSet<Speciality>();

	
	public Set<Speciality> getSpecialties() {
		return specialties;
	}
	public void setSpecialties(Set<Speciality> specialties) {
		this.specialties = specialties;
	}
	
	
}
