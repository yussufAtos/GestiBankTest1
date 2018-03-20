package com.example.demo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Compte implements Serializable{
	
	@Id@GeneratedValue
	private Long  id;
	private String libelle;
	private Date dateCreation;
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Compte(String libelle, Date dateCreation) {
		super();
		this.libelle = libelle;
		this.dateCreation = dateCreation;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	

}
