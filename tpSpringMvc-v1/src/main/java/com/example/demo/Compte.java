package com.example.demo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "COMPTE")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "type_compte", discriminatorType = DiscriminatorType.STRING, length = 2)

public class Compte implements Serializable {

	@Id
	@GeneratedValue
	private Long codeCompte;
	private String libelle;
	private double solde;
	@ManyToOne
	@JoinColumn(name = "id_Client")
	private Client client;
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Compte(String libelle, double solde, Client client) {
		super();
		this.libelle = libelle;
		this.solde = solde;
		this.client = client;
	}

public Long getCodeCompte() {
		return codeCompte;
	}
	public void setCodeCompte(Long codeCompte) {
		this.codeCompte = codeCompte;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	



}
