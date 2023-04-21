public class Main {
	// Main method
	public static void main(String[] args) {
		Student s1 = new Student("Chisomo","Chikanda","0986546786", "chi0980@gmail.com");
		Employee e1 = new Employee("Steve", "Tsekani", "0996874322", "stv@h.co", 1, 1000000);
		Faculty f1 = new Faculty("Lois", "Chikanda", "0885673682", "lois@gmail.com", 1, 1000000,"88","mngr");
		Staff st1 = new Staff("Lizzo","Tholo","0886754895", "lizzo@yahoo.com", 3,432,"keeper");

		System.out.println(s1.toString());
		System.out.println();
		System.out.println(e1.toString());

		System.out.println();
		System.out.println(f1.toString());

		System.out.println();
		System.out.println(st1.toString());
	}
}

//task 
//create the following:
//student1
//employee1
//faculty1
//staff1