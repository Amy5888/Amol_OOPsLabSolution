package greatlearninglab1;
import java.util.Scanner;

public class Employee {
	
	public String firstname;
	public String lastname;
	
	public String getfirstname(){
		return firstname;
		
	}
	public void setfirstname(String firstname) {
		this.firstname =firstname;
		
	}
	
	public String getlastname() {
		return lastname;
	}

	public void setlastname(String lastname) {
		this.lastname =lastname;
	}
	
	public Employee() {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" Enter your first name");
		firstname = scanner.next();
	System.out.println(" Enter your last name");
	 lastname = scanner.next();
		
		
	}
	
	
}
