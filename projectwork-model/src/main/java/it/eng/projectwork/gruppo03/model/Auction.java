package it.eng.projectwork.gruppo03.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Auction {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="AUCTION_ID_SEQ")
	@SequenceGenerator(name="AUCTION_ID_SEQ", sequenceName="ID_SEQ", allocationSize=1)
	private Long id;
	
	@OneToOne
	@Column(name="PRODUCT_FK")
	private Product product;
	
	@ManyToOne
	@Column(name="SUPPLIER_FK")
	private Supplier supplier;
	
	@OneToMany(mappedBy="auction")
	private List<Bid> bids;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public Supplier getSupplier() {
		return supplier;
	}
	
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	
	public List<Bid> getBid() {
		return bids;
	}
	
	public void setBid(List<Bid> bid) {
		this.bids = bid;
	}
	

}
