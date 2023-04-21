public class Employee extends Person {
       private int office; 
       private double salary; 
       private MyDate dateHired; 
   
       public Employee(String name, String address, String phone, String email, int office, double salary) {
              // call the constructor of the parent class
           super(name, address, phone, email); 
           this.office = office; 
           this.salary = salary; 
           this.dateHired = new MyDate(); 
       }
       // return the office of the employee
       public int getOffice() {
           return office; 
       }
       // return the salary of the employee 
       public String getSalary() {
           return String.format("%.2f", salary);
       }
       // return the date the employee was hired 
       public String getDateHired() {
           return dateHired.toString(); 
       }
       // set the office of the employee to a new value
       public void setOffice(int office) {
           this.office = office; 
       }
       // set the salary of the employee to a new value
       public void setSalary(double salary) {
           this.salary = salary; 
       }
       // set the dateHired to the current date
       public void setDateHired() {
           this.dateHired = new MyDate(); 
       }
   
       @Override
       public String toString() {
           // return a string representation of the employee object
           return super.toString() + "\nOffice: " + office + "\nSalary: $" + getSalary() + "\nDate hired: " + getDateHired();
       }
   }
   