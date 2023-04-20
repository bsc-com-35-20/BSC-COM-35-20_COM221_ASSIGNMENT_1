public class Person{
// These are private instance variables
private String name;
private String address;
private String phoneNumber;
private String email;

// This is the default constructor
public Person() {

}
public Person(String name,String address,String phoneNumber,String email){

this.name = name;
this.address = address;
this.phoneNumber = phoneNumber;
this.email = email;

}
// These are getter methods to get the values of the instance variables
public String getName() {
	return name;
}

public String getAddress() {
	return address;
}

public String getPhoneNumber() {
	return phoneNumber;
}

public String getEmail() {
	return email;
}

// These are setter methods to set the values of the instance variables
public void setName(String name) {
	this.name = name;
}

public void setAddress(String address) {
	this.address = address;
}

public void setPhone(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}

public void setEmail(String email) {
	this.email = email;
}

// This method returns a string representation of the object
public String toString() {
	return "\nName: " + name + "\nAddress: " + address + 
			 "\nPhone number: " + phoneNumber + "\nEmail address: " + email;
}
}