package entity;

public class Worker implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Worker(String FirstName, String LastName, String PW, String WorkerID, String Email, String Role,
			String ParkID) {
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Password = PW;
		this.WorkerID = WorkerID;
		this.Email = Email;
		this.Role = Role;
		this.ParkID=ParkID;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
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

	public String getWorkerID() {
		return WorkerID;
	}

	public void setWorkerID(String workerID) {
		WorkerID = workerID;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	public String getParkID() {
		return ParkID;
	}

	public void setParkID(String parkID) {
		ParkID = parkID;
	}

	private String Password;
	private String FirstName;
	private String LastName;
	private String WorkerID;
	private String Email;
	private String Role;
	private String ParkID;
}
