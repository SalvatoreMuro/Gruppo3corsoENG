package it.eng.projectwork.gruppo03.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("S")
@Table(name="SUPPLIER")
public class Supplier extends User {
	
	private String nomeAzienda;
	@Column(name="P_IVA", unique=true)
	private String piva;
	
	public String getNomeAzienda() {
		return nomeAzienda;
	}
	public void setNomeAzienda(String nomeAzienda) {
		this.nomeAzienda = nomeAzienda;
	}
	public String getPiva() {
		return piva;
	}
	public void setPiva(String piva) {
		this.piva = piva;
	}
	
}
