package models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Individu")
public class Individu {
	
	@Id
    @Column(name = "id_individu")
	private int idIndividu; 
	private String nom;
	private String prenom;
	private String epithete;
	public int getIdIndividu() {
		return idIndividu;
	}
	public void setIdIndividu(int idIndividu) {
		this.idIndividu = idIndividu;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEpithete() {
		return epithete;
	}
	public void setEpithete(String epithete) {
		this.epithete = epithete;
	}
	
	
}
