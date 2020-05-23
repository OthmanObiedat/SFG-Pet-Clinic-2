package org.pet.clinic.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pets")
public class Pet extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "name")
	private String name;
	@ManyToOne
	@JoinColumn(name = "type_id")
	private PetType petType;
	@ManyToOne
	@JoinColumn( name = "owner_id")
	private Owner owner;
	@Column(name = "birth_day")
	private LocalDate birthDate;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "pet")
	private Set<Visit> visits = new HashSet<Visit>();
	
	
	public Set<Visit> getVisits() {
		return visits;
	}

	public void setVisits(Set<Visit> visits) {
		this.visits = visits;
	}

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
