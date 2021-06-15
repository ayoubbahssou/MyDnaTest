package models.entity;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Echantillon")
public class Echantillon {
	
	@Id
    @Column(name = "code_barre_echantillon")
	private UUID codeBarreEchantillon;
	private Date dateAnalyse;
	private String codeAnalyseur;
	private String codeLabo;
	
	public UUID getCodeBarreEchantillon() {
		return codeBarreEchantillon;
	}
	public void setCodeBarreEchantillon(UUID codeBarreEchantillon) {
		this.codeBarreEchantillon = codeBarreEchantillon;
	}
	public Date getDateAnalyse() {
		return dateAnalyse;
	}
	public void setDateAnalyse(Date dateAnalyse) {
		this.dateAnalyse = dateAnalyse;
	}
	public String getCodeAnalyseur() {
		return codeAnalyseur;
	}
	public void setCodeAnalyseur(String codeAnalyseur) {
		this.codeAnalyseur = codeAnalyseur;
	}
	public String getCodeLabo() {
		return codeLabo;
	}
	public void setCodeLabo(String codeLabo) {
		this.codeLabo = codeLabo;
	}
	
	

}
