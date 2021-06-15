package models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Marqueur")
public class Marqueur {
	
	@Id
    @Column(name = "id_marqueur")
	private int idMarqueur;
	private String codeMarqueur;
	
	public int getIdMarqueur() {
		return idMarqueur;
	}
	public void setIdMarqueur(int idMarqueur) {
		this.idMarqueur = idMarqueur;
	}
	public String getCodeMarqueur() {
		return codeMarqueur;
	}
	public void setCodeMarqueur(String codeMarqueur) {
		this.codeMarqueur = codeMarqueur;
	}
	
	
}
