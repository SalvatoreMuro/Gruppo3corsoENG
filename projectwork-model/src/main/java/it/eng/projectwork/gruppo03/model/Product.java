package it.eng.projectwork.gruppo03.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="PRODUCT_ID_SEQ")
	@SequenceGenerator(name="PRODUCT_ID_SEQ", sequenceName = "ID_SEQ",allocationSize = 1)
	private Long id;
	

	@ManyToOne
	@Column(name ="CATEGORY_FK")
	
	private Category category;
	
	private String Description;
	
	
	public Product() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescrizione() {
		return Description;
	}

	public void setDescrizione(String descrizione) {
		Description = descrizione;
	}
	
	
	

	
}
