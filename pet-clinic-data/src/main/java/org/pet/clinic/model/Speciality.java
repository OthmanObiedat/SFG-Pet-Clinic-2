package org.pet.clinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "specialities")
public class Speciality extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "descreption")
	private String descreption;

	public String getDescreption() {
		return descreption;
	}

	public void setDescreption(String descreption) {
		this.descreption = descreption;
	}
}
