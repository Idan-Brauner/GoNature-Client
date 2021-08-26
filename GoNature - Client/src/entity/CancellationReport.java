package entity;

public class CancellationReport implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String OrderNum;
	private String VisitorType;
	private String Date;
	private String VisitorsNum;
	private String TypeCase;
	private String Park;

	public CancellationReport(String order_num, String visitor_type, String date, String visitor_num) {
		super();
		OrderNum = order_num;
		VisitorType = visitor_type;
		Date = date;
		VisitorsNum = visitor_num;

	}

	public String getPark() {
		return Park;
	}

	public void setPark(String park) {
		Park = park;
	}

	public String getTypeCase() {
		return TypeCase;
	}

	public void setTypeCase(String type_case) {
		TypeCase = type_case;
	}

	public String getOrderNum() {
		return OrderNum;
	}

	public void setOrderNum(String order_num) {
		OrderNum = order_num;
	}

	public String getVisitorType() {
		return VisitorType;
	}

	public void setVisitorType(String visitor_typ) {
		VisitorType = visitor_typ;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getVisitorsNum() {
		return VisitorsNum;
	}

	public void setVisitorsNum(String visitor_num) {
		VisitorsNum = visitor_num;
	}
}
