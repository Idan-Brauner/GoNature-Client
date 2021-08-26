package entity;

import java.io.Serializable;

public class DepVisitorReport implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String Vmonth;
	private String VisitorNumber;
	private String VisitorType;
	private String StayTime;
	private String Vdate;

	public String getVdate() {
		return Vdate;
	}

	public void setVdate(String vdate) {
		Vdate = vdate;
	}

	public String getVmonth() {
		return Vmonth;
	}

	public DepVisitorReport(String Vdate, String StayTime) {
		super();
		this.Vdate = Vdate;
		this.StayTime = StayTime;
	}

	public void setVmonth(String vmonth) {
		Vmonth = vmonth;
	}

	public String getVisitorNumber() {
		return VisitorNumber;
	}

	public void setVisitorNumber(String visitorNumber) {
		VisitorNumber = visitorNumber;
	}

	public String getVisitorType() {
		return VisitorType;
	}

	public void setVisitorType(String visitorType) {
		VisitorType = visitorType;
	}

	public String getStayTime() {
		return StayTime;
	}

	public void setStayTime(String stayTime) {
		StayTime = stayTime;
	}

}
