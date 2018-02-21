package it.eng.projectwork.gruppo03.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="IMAGE")
public class Image {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="IMAGE_ID_SEQ")
	@SequenceGenerator(name="IMAGE_ID_SEQ", sequenceName="IMAGE_ID_SEQ", allocationSize=1)
	private Long id;
	
	@Basic(fetch = FetchType.LAZY)
	private byte[] body;
	
	private String fileName;
	
	@ManyToOne
	private Product product;
	
	public Image() {}

	public Image(byte[] body, String fileName, Product product) {
		this.body = body;
		this.fileName = fileName;
		this.product = product;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public byte[] getBody() {
		return body;
	}

	public void setBody(byte[] body) {
		this.body = body;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
}
