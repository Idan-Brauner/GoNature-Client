package entity;

public class Visitor implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String FirstName;
	private String LastName;
	private String VisitorID;
	private String Password;
	private String Email;
	private String Phone;

	public String getNumOfVisitors() {
		return NumOfVisitors;
	}

	public void setNumOfVisitors(String numOfVisitors) {
		NumOfVisitors = numOfVisitors;
	}

	public String getPayment_Method() {
		return Payment_Method;
	}

	public void setPayment_Method(String payment_Method) {
		Payment_Method = payment_Method;
	}

	public String getCredit_Card_Number() {
		return Credit_Card_Number;
	}

	public void setCredit_Card_Number(String credit_Card_Number) {
		Credit_Card_Number = credit_Card_Number;
	}

	private String MemberID;
	private String UserType;
	private String NumOfVisitors;
	private String Payment_Method;
	private String Credit_Card_Number;

	public Visitor(String FirstName, String LastName, String Password, String VisitorID, String Email, String Phone,
			String MemberID, String UserType, String NumOfVisitors, String Payment_Method, String Credit_Card_Number) {
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Password = Password;
		this.VisitorID = VisitorID;
		this.Phone = Phone;
		this.NumOfVisitors = NumOfVisitors;
		this.Email = Email;
		this.Payment_Method = Payment_Method;
		this.Credit_Card_Number = Credit_Card_Number;
		this.UserType = UserType;
		this.MemberID = MemberID;

	}

	public Visitor(String FirstName, String LastName, String PW, String VisitorID, String Email, String Phone,
			String MemberID, String UserType) {
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Password = PW;
		this.VisitorID = VisitorID;
		this.Email = Email;
		this.Phone = Phone;
		this.MemberID = MemberID;
		this.UserType = UserType;
	}

	public String getUserType() {
		return UserType;
	}

	public void setUserType(String userType) {
		UserType = userType;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getVisitorID() {
		return VisitorID;
	}

	public void setVisitorID(String visitorID) {
		VisitorID = visitorID;
	}

	public String getPassword() {
		return Password;
	}

	public String getMemberID() {
		return MemberID;
	}

	public void setMemberID(String memberID) {
		MemberID = memberID;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	@Override
	public String toString() {
		return (FirstName + " " + LastName + " " + Password + " " + VisitorID + " " + Email + " " + Phone + " "
				+ MemberID + " " + UserType + " " + NumOfVisitors + " " + Payment_Method + " " + Credit_Card_Number
				+ " ");

	}

}
