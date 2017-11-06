import java.util.Scanner;

public class MySignIn {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String user, pass;
		
		System.out.print("Username: ");
		user = input.nextLine();
		
		System.out.print("Password: ");
		pass = input.nextLine();
		
		if(user.equals("nicole@qa.com") && (pass.equals("password"))) {
			System.out.println("Login Successful!");
		}else {
			System.out.println("Wrong! Do it again -- if this is truly who you say you are.");
		}
		
			
			
		}

	}
