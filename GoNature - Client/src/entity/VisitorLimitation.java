package entity;

public class VisitorLimitation implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String Date;
	String Limit;
	String StayTime;
	
	
	public VisitorLimitation(String Date, String Limit, String StayTime) {
		
		this.Date = Date;
		this.Limit = Limit;
		this.StayTime = StayTime;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String Date) {
		this.Date = Date;
	}
	public String getLimit() {
		return Limit;
	}
	public void setLimit(String Limit) {
		this.Limit = Limit;
	}
	public String getStayTime() {
		return StayTime;
	}
	public void setStayTime(String StayTime) {
		this.StayTime = StayTime;
	}
	
	
	

}