package models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.JoinColumn;


@Entity
@Table(name = "Allele")
public class Allele {
	
	@Id
    @Column(name = "id_allele")
	private int idAllele; 
	private int idMarqueur;
	private String 	codeAllele;
	private int distance;
	
	@ManyToOne
	// déclaration d'une table d'association
	@JoinTable(name = "profil_genetique",
			joinColumns = @JoinColumn(name = "id_allele"),
					inverseJoinColumns = @JoinColumn(name = "code_barre_echantillon"))
	     
	private Echantillon echantillon;
	
	public int getIdAllele() {
		return idAllele;
	}
	public void setIdAllele(int idAllele) {
		this.idAllele = idAllele;
	}
	
	public int getIdMarqueur() {
		return idMarqueur;
	}
	public void setIdMarqueur(int idMarqueur) {
		this.idMarqueur = idMarqueur;
	}
	public String getCodeAllele() {
		return codeAllele;
	}
	public void setCodeAllele(String codeAllele) {
		this.codeAllele = codeAllele;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	
}
