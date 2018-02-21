package it.eng.projectwork.gruppo03.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	
	private String description;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="product", cascade=CascadeType.ALL)
	private List<Image> images;
	
	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

	public Product() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescrizione(String description) {
		this.description = description;
	}

}
