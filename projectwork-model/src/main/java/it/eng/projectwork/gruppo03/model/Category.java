package it.eng.projectwork.gruppo03.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CATEGORY")
@Embeddable
public class Category {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CATEGORY_ID_SEQ")
	@SequenceGenerator(name="CATEGORY_ID_SEQ", sequenceName="CATEGORY_ID_SEQ", allocationSize=1)
	private Long codice;
	
	private String descrizione;
	
	@ManyToOne
	@Column(name="PRODUCT_FK")
	private Product product;
	
	public Category() {}

	public Long getCodice() {
		return codice;
	}

	public void setCodice(Long codice) {
		this.codice = codice;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
}
