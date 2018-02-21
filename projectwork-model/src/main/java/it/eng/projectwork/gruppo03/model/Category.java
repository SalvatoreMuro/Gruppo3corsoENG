package it.eng.projectwork.gruppo03.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="CATEGORY")

public class Category {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CATEGORY_ID_SEQ")
	@SequenceGenerator(name="CATEGORY_ID_SEQ", sequenceName="CATEGORY_ID_SEQ", allocationSize=1)
	private Long id;
	
	private String description;
	
	@OneToMany(mappedBy="category")
	private List<Product> products;
	
	public Category() {}

	public Category(String description, List<Product> products) {
		this.description = description;
		this.products = products;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
