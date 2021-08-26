package entity;

public class OrderTotalNumberOfVisitorsReport implements java.io.Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String Type;
	private String Date;
	public OrderTotalNumberOfVisitorsReport(String type, String date, String amount) {
		super();
		Type = type;
		Date = date;
		Amount = amount;
	}

	private String Amount;

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getAmount() {
		return Amount;
	}

	public void setAmount(String amount) {
		Amount = amount;
	}
}
