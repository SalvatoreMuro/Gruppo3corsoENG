package it.eng.projectwork.model.interfaces;

import java.util.List;

import it.eng.projectwork.gruppo03.model.Auction;
import it.eng.projectwork.gruppo03.model.Bid;

public enum PRICING {
	UPWARDS{
		@Override
		public boolean canAdd(Bid b, Bid newBid) {
			return newBid.getPrice()>b.getPrice();
		}
		
		@Override
		public Bid currentBid(List<Bid> bids) {
			return bids.stream().max((a,b)->{return a.getPrice()-b.getPrice()>0?1:a.getPrice()-b.getPrice()<0?-1:0;}).get();
		}
		
	},DOWNWARDS{
		@Override
		public boolean canAdd(Bid b, Bid newBid) {
			return newBid.getPrice()<b.getPrice();
		}
		
		@Override
		public Bid currentBid(List<Bid> bids) {
			return bids.stream().min((a,b)->{return (int)(a.getPrice()- b.getPrice());}).get();
		}
	};
	
	public abstract boolean canAdd(Bid b,Bid newBid);
	
	public abstract Bid currentBid(List<Bid> bid);
	
	public boolean canAdd(List<Bid> bids, Bid newBid) {
		for(Bid  bid: bids){
			if(!canAdd(bid, newBid)){
				return false;
			}
		}
		return true;
	}

}
