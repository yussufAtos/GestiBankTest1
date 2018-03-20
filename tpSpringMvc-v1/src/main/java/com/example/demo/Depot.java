package com.example.demo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Depot implements Serializable {
	@Id
	@GeneratedValue
	private Long numeroVersment ;
    private double montant;
	private Date dateVersment;
	
	@ManyToOne
	@JoinColumn(name = "id_Compte")
	private Compte compte;
	
	
	
	public Depot() {
	
	}

	public Depot(double montant, Date dateVersment, Compte compte) {
		super();
		this.montant = montant;
		this.dateVersment = dateVersment;
		this.compte = compte;
	}

	public Long getNumeroVersment() {
		return numeroVersment;
	}
	public void setNumeroVersment(Long numeroVersment) {
		this.numeroVersment = numeroVersment;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public Date getDateVersment() {
		return dateVersment;
	}
	public void setDateVersment(Date dateVersment) {
		this.dateVersment = dateVersment;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	

}
