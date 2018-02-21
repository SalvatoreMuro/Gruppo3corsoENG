package it.eng.projectwork.gruppo03.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="BID")
public class Bid {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BID_ID_SEQ")
	@SequenceGenerator(name="BID_ID_SEQ", sequenceName="ID_SEQ", allocationSize=10)
	private Long oid;
	
	@ManyToOne
	@Column(name="AUCTION_FK")
	private Auction auction;
	
	@ManyToOne
	@Column(name="BIDDER_FK")
	private User bidder;
	
	private double value;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date time;
	
	public Bid() {}
	
	

	public Bid(Auction auction, User bidder, double value, Date time) {
		this.auction = auction;
		this.bidder = bidder;
		this.value = value;
		this.time = time;
	}



	public long getOid() {
		return oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

	public Auction getAuction() {
		return auction;
	}

	public void setAuction(Auction auction) {
		this.auction = auction;
	}

	public User getBidder() {
		return bidder;
	}

	public void setBidder(User bidder) {
		this.bidder = bidder;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}
	
}
