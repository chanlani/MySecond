package submit_class.submit4;

public class TrafficCard {
	int busFee = 1200;
	int taxiFee = 2800;
	
	
	public TrafficCard() {
		
	}
	
	@Override
	public String toString() {
		return "TrafficCard [busFee=" + busFee + ", taxiFee=" + taxiFee + "]";
	}
	public int getBusFee() {
		return busFee;
	}
	public void setBusFee(int busFee) {
		this.busFee = busFee;
	}
	public int getTaxiFee() {
		return taxiFee;
	}
	public void setTaxiFee(int taxiFee) {
		this.taxiFee = taxiFee;
	}
	
	
}
