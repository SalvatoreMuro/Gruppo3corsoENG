package it.eng.projectwork.gruppo03.model;

import java.util.Date;
import java.util.List;

import javax.management.RuntimeErrorException;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


@Entity
@Table (name="AUCTION")
public class Auction {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="AUCTION_ID_SEQ")
	@SequenceGenerator(name="AUCTION_ID_SEQ", sequenceName="ID_SEQ", allocationSize=1)
	private Long id;
	
	@OneToOne
	@Column(name="PRODUCT_FK", nullable=false)
	private Product product;
	
	@ManyToOne
	@Column(name="SUPPLIER_FK", nullable=false)
	private Supplier supplier;
	
	@OneToMany(mappedBy="auction")
	private List<Bid> bids;
	
	@Column(nullable=false)
	private String title;
	
	@Column
	private String description;
	
	@Version
	private Long version;
	
	@Temporal(TemporalType.DATE)
	private Date startDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date endDate;
	
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
	
	public List<Bid> getBids() {
		return bids;
	}
	
	public void setBids(List<Bid> bids) {
		this.bids = bids;
	}

	public Auction() {}
	
	public Auction(String title, String description, Supplier supplier,Product product,Date startDate,Date endDate) {
		this.title = title;
		this.description = description;
		this.supplier = supplier;
		this.product = product;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	public void addBid(Bid newBid) {
		if(getSTATE().canIAddBid()) {
			if(getPricing().canIAddBid(getBids(), newBid)) {
				newBid.setAuction(this);
				bids.add(newBid);
				
			}else {
				throw new RuntimeException("Price is not valid"); //Temporanea, da rendere Exception personalizzata
			}
		}else {
			throw new RuntimeException("State is not valid"); //Temporanea, da rendere Exception personalizzata
		}
		
	}
 
	public STATE getSTATE() {
		return STATE.eval(this);
	}
	
	public PRICING getPricing() {
		return this.pricing;
	}
}
