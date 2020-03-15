package org.sid.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Produit implements Serializable{
	@Id
	@GeneratedValue
private Long id;
	@Column(length=70)
private String designation;
private double prix;
private int quantite;



private Produit() {
	super();
	// TODO Auto-generated constructor stub
}

public Produit(String designation, double prix, int quantite) {
	super();
	this.designation = designation;
	this.prix = prix;
	this.quantite = quantite;
}

public String getDesignation() {
	return designation;
}

public void setDesignation(String designation) {
	this.designation = designation;
}

public double getPrix() {
	return prix;
}

public void setPrix(double prix) {
	this.prix = prix;
}

public int getQuantite() {
	return quantite;
}

public void setQuantite(int quantite) {
	this.quantite = quantite;
}

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}




}
