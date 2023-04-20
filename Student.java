public class Student extends Person{
    private int status;
	public final static int FRESHMAN = 1;
	public final static int SOPHOMORE = 3;
	public final static int JUNIOR = 2;
	public final static int SENIOR = 4;

	public Student(String name, String address,  
		String phone, String email) {
		super(name, address, phone, email);
		//this.status = status;
	}

	// Setting new status 
	public void setStatus(int status) {
		this.status = status; 
	}

	//returning status
	public String getStatus() {
        if (status == 1) {
            return "freshman";
        } else if (status == 2) {
            return "sophomore";
        } else if (status == 3) {
            return "junior";
        } else if (status == 4) {
            return "senior";
        } else {
            return "Unknown";
        }
        
	}

	public String toString() {
		return super.toString();
	}
}