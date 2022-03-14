package greatlearninglab1;

import java.util.Random;


public class credentialservice {
	
	public char[] generatedpassword() {
		
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*<>?+-=/?._";
		
		String values = capitalLetters + smallLetters + numbers +specialCharacters;
		
		Random random = new Random();
		
		char [] password = new char[8];
		
		for(int i=0;i<8;i++) {
			password[i] = values.charAt(random.nextInt(values.length()));
			
				
		}
		return password;
		
	}
	
	public String generateEmailaddress(String firstname, String lastname, String department) {
		
		
		return firstname + lastname + "@" + department + "triveni.com";
		
	}
	
	
	public void showCredentials(Employee employee, String email ,char []generatedpassword) {
		
		System.out.println("Dear " + employee.getfirstname()+ " your generated cdrentials are as follows");
		System.out.println(" Email -->" + email);
		System.out.print(" password --> " +"");
		System.out.print(generatedpassword );
		
	}
	
	
}
