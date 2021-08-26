package entity;

public class WaitingListDate implements java.io.Serializable { 
	private static final long serialVersionUID = 1L;

	private String Date;
	
	public WaitingListDate(String Date) {
	
		this.Date=Date;
		
	}
	
	
	public String getDate() {
		return Date;
	}


	public void setDate(String date) {
		Date = date;
	}


	@Override
	public String toString() {
		return this.getDate();
	}
}
