package entity;

public class Discount implements java.io.Serializable {
	String activeDate;
	String finsihDate;
	String discount;
	
	public Discount(String activeDate, String finsihDate, String discount) {
		//super();
		this.activeDate = activeDate;
		this.finsihDate = finsihDate;
		this.discount = discount;
	}
	public String getActiveDate() {
		return activeDate;
	}
	public void setActiveDate(String activeDate) {
		this.activeDate = activeDate;
	}
	public String getFinsihDate() {
		return finsihDate;
	}
	public void setFinsihDate(String finsihDate) {
		this.finsihDate = finsihDate;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
}
	

	
	


