package models.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Identification")
public class Identification {
	
	@Id
    @Column(name = "code_barre_echantillon")
	private UUID codeBarreEchantillon;
	private int idIndividu;
	
	public UUID getCodeBarreEchantillon() {
		return codeBarreEchantillon;
	}
	public void setCodeBarreEchantillon(UUID codeBarreEchantillon) {
		this.codeBarreEchantillon = codeBarreEchantillon;
	}
	public int getIdIndividu() {
		return idIndividu;
	}
	public void setIdIndividu(int idIndividu) {
		this.idIndividu = idIndividu;
	}
}
