package entity;

public class ApproveList implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ParkName;
	private String StartDate;
	private String FinishDate;
	private String RequestType;
	private String RequestStatus;

	public ApproveList(String parkName, String requestType, String startDate, String finishDate, String requestStatus) {
		ParkName = parkName;
		StartDate = startDate;
		FinishDate = finishDate;
		RequestType = requestType;
		RequestStatus = requestStatus;
	}

	public String getParkName() {
		return ParkName;
	}

	public void setParkName(String parkName) {
		ParkName = parkName;
	}

	public String getStartDate() {
		return StartDate;
	}

	public void setStartDate(String startDate) {
		StartDate = startDate;
	}

	public String getFinishDate() {
		return FinishDate;
	}

	public void setFinishDate(String finishDate) {
		FinishDate = finishDate;
	}

	public String getRequestType() {
		return RequestType;
	}

	public void setRequestType(String requestType) {
		RequestType = requestType;
	}

	public String getRequestStatus() {
		return RequestStatus;
	}

	public void setRequestStatus(String requestStatus) {
		RequestStatus = requestStatus;
	}

	@Override
	public String toString() {
		return (ParkName + " " + RequestType + " " + StartDate + " " + FinishDate + " " + RequestStatus + " ");

	}

}
//    private CheckBox ApproveOrDecline;    

//		this.ApproveOrDecline = new CheckBox();	

//	 public CheckBox getApproveOrDecline() {
//	        return ApproveOrDecline;
//	    }
//	 
//	    public void setApproveOrDecline(CheckBox ApproveOrDecline) {
//	        this.ApproveOrDecline = ApproveOrDecline;
//	    }
