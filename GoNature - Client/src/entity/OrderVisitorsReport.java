package entity;

public class OrderVisitorsReport implements java.io.Serializable {

	public String getVisitDate() {
		return VisitDate;
	}

	public void setVisitDate(String visitDate) {
		VisitDate = visitDate;
	}

	public String getVisitHour() {
		return VisitHour;
	}

	public void setVisitHour(String visitHour) {
		VisitHour = visitHour;
	}

	public String getUserType() {
		return UserType;
	}

	public void setUserType(String userType) {
		UserType = userType;
	}

	public OrderVisitorsReport(String userType, String visitDate, String visitorsNum) {
		super();
		UserType = userType;
		VisitDate = visitDate;
		this.visitorsNum = visitorsNum;
	}

	public OrderVisitorsReport(String visitorsNum) {
		super();
		this.visitorsNum = visitorsNum;
	}

	public String getVisitorNumber() {
		return VisitorNumber;
	}

	public void setVisitorNumber(String visitorNumber) {
		VisitorNumber = visitorNumber;
	}

	public String getVisitorsNum() {
		return visitorsNum;
	}

	public void setVisitorsNum(String visitorsNum) {
		this.visitorsNum = visitorsNum;
	}

	public OrderVisitorsReport(String visitorNumber, String visitorsNum) {
		super();
		VisitorNumber = visitorNumber;
		this.visitorsNum = visitorsNum;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String VisitDate;
	private String VisitHour;
	private String UserType;
	private String VisitorNumber;
	private String visitorsNum;
}
