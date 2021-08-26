package entity;

public class Order implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private String MemberID;
	private int OrderID;
	private String Park;
	private String Date;
	private String Hour;
	private String VisitorsNum;
	private String Email;
	private String UserType;
	private String EntryStatus;
	private String Price;
	private String MonthName;
	private String StayTime;

	public Order(String date, String hour, String visitorsNum, String monthName) {
		super();
		Date = date;
		Hour = hour;
		VisitorsNum = visitorsNum;
		MonthName = monthName;
	}

	public Order(String MemberID, int OrderID, String Park, String Date, String Hour, String VisitorNum, String Email,
			String UserType) {
		this.MemberID = MemberID;
		this.OrderID = OrderID;
		this.Park = Park;
		this.Date = Date;
		this.Hour = Hour;
		this.VisitorsNum = VisitorNum;
		this.Email = Email;
		this.UserType = UserType;
	}

	public Order(String MemberID, String Date, String VisitorNum, String Hour, String Park, String EntryStatus) {
		this.MemberID = MemberID;
		this.Date = Date;
		this.VisitorsNum = VisitorNum;
		this.Hour = Hour;
		this.Park = Park;
		this.EntryStatus = EntryStatus;
	}

	public Order(String park, String visitorsNum) {
		super();
		Park = park;
		VisitorsNum = visitorsNum;
	}

	public Order(String park, String visitorsNum, String Hour, String Date, String Month) {
		super();
		Park = park;
		VisitorsNum = visitorsNum;
		this.Hour = Hour;
		this.Date = Date;
		this.MonthName = Month;
	}

	public Order(String MemberID, int OrderID, String Park, String Date, String Hour, String VisitorNum, String Email,
			String UserType, String EntryStatus, String Price, String MonthName, String StayTime) {
		this.MemberID = MemberID;
		this.OrderID = OrderID;
		this.Park = Park;
		this.Date = Date;
		this.Hour = Hour;
		this.VisitorsNum = VisitorNum;
		this.Email = Email;
		this.UserType = UserType;
		this.EntryStatus = EntryStatus;
		this.Price = Price;
		this.MonthName = MonthName;
		this.StayTime = StayTime;
	}

	public String getPrice() {
		return Price;
	}

	public void setPrice(String price) {
		Price = price;
	}

	public String getMonthName() {
		return MonthName;
	}

	public void setMonthName(String monthName) {
		MonthName = monthName;
	}

	public String getStayTime() {
		return StayTime;
	}

	public void setStayTime(String stayTime) {
		StayTime = stayTime;
	}

	public String getEntryStatus() {
		return EntryStatus;
	}

	public void setEntryStatus(String entryStatus) {
		EntryStatus = entryStatus;
	}

	public String getUserType() {
		return UserType;
	}

	public void setUserType(String userType) {
		UserType = userType;
	}

	public String getMemberID() {
		return MemberID;
	}

	public void setMemberID(String memberID) {
		MemberID = memberID;
	}

	public int getOrderID() {
		return OrderID;
	}

	public void setOrderID(int iD) {
		OrderID = iD;
	}

	public String getPark() {
		return Park;
	}

	public void setPark(String park) {
		Park = park;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getHour() {
		return Hour;
	}

	public void setHour(String hour) {
		Hour = hour;
	}

	public String getVisitorsNum() {
		return VisitorsNum;
	}

	public void setVisitorsNum(String visitorsNum) {
		VisitorsNum = visitorsNum;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return this.getMemberID() + " " + this.getPark() + " " + this.getDate() + " " + this.getHour() + " "
				+ this.getVisitorsNum() + " " + this.getEmail() + " " + this.getUserType() + " " + this.getPrice() + " "
				+ this.getMonthName() + " " + this.getStayTime();
	}

}
