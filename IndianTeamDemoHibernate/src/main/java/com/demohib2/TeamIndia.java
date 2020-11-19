package com.demohib2;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
public class TeamIndia {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int slno;
	private String firstname;
	private String lastname;
	public int getSlno() {
		return slno;
	}
	public void setSlno(int slno) {
		this.slno = slno;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public TeamIndia() {
		
	}
	public TeamIndia(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	

}
