package greatlearninglab1;
import java.util.Scanner;

public class Main {
	
	public static void main(String[]args) {
		
	
		
		Employee employee = new Employee();
		credentialservice cs =new credentialservice();
		String generatedEmail;
		char[] generatedpassword;
		
		
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		
		Scanner sc =new Scanner(System.in);
		int option = sc.nextInt();
		
		if(option==1) {
			generatedEmail= cs.generateEmailaddress(employee.getfirstname().toLowerCase(),
					        employee.getlastname().toLowerCase(), "tech.");
			generatedpassword= cs.generatedpassword();
			                   cs.showCredentials(employee, generatedEmail, generatedpassword);
		}
		else if(option==2) {
			generatedEmail= cs.generateEmailaddress(employee.getfirstname().toLowerCase(),
					        employee.getlastname().toLowerCase(), "admin.");
			generatedpassword= cs.generatedpassword();
			                   cs.showCredentials(employee, generatedEmail, generatedpassword);
		
			
		}
		else if(option==3) {
			generatedEmail= cs.generateEmailaddress(employee.getfirstname().toLowerCase(),
					        employee.getlastname().toLowerCase(), "hr.");
			generatedpassword= cs.generatedpassword();
			                   cs.showCredentials(employee, generatedEmail, generatedpassword);
		
		}
		else if(option==4) {
			generatedEmail= cs.generateEmailaddress(employee.getfirstname().toLowerCase(),
					        employee.getlastname().toLowerCase(), "lg.");
			generatedpassword= cs.generatedpassword();
			                   cs.showCredentials(employee, generatedEmail, generatedpassword);
		
	} 
		else
			System.out.println("Enter the valid option");
		
		sc.close();
	
	}
}
