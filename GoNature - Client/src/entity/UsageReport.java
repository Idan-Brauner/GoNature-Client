package entity;

public class UsageReport implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String Date;


	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public UsageReport(String date) {
		super();
		this.Date = date;
	
	}

}
