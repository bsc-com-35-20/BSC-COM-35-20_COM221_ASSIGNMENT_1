public class Faculty extends Employee{
    // Data fields
	private String officeHours;
	private String rank;

	// Constructors
	public Faculty(String name, String address, String phone, String email, 
		int office, double salary, String officeHours, String rank) {
			 // call the constructor of the parent class
		super(name, address, phone, email, office, salary);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	//this will return officeHours 
	public String getOfficeHours() {
		return officeHours;
	}

	// Set new officeHours 
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	// this will return rank
	public String getRank() {
		return rank;
	}

	// Set new rank 
	public void setRank(String rank) {
		this.rank = rank;
	}

	//this will return a string description of the class 
	public String toString() {
		return super.toString() + "\nOffice hours: " + officeHours +
		"\nRank: " + rank;
	}
}