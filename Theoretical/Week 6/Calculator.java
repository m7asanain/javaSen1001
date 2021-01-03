package week6_sec2;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String systemUsername = "m7asanain", systemPassword = "asdf";
		
		int counter = 0;
		while (counter < 3) {
			System.out.println("Enter your username and password");
			String givenUsername = input.next();
			String givenPassword = input.next();
			System.out.println("Enter your age");
			int age = input.nextInt();
			
			if (givenUsername.equals(systemUsername) && givenPassword.equals(systemPassword) && age >= 20) {
				System.out.println("user accepted");
				
				boolean wannaContinue = true;
				
				while (wannaContinue) {
					System.out.println("welcome the the system\nEnter first number:");
					int number1 = input.nextInt();
					System.out.println("enter second number");
					int number2 = input.nextInt();
					System.out.println("Select the operator");
					System.out.println("press 1 for +");
					System.out.println("press 2 for -");
					System.out.println("press 3 for *");
					System.out.println("press 4 for /");
					System.out.println("press 5 for %");
					System.out.println("press -1 to exit");
					
					int operator = input.nextInt();
					
					switch (operator) {
						case 1:
							System.out.println(number1 + "+" + number2 + "=" + (number1 + number2));
							break;
						case 2:
							System.out.println(number1 + "-" + number2 + "=" + (number1 - number2));
							break;
						case 3:
							System.out.println(number1 + "*" + number2 + "=" + (number1 * number2));
							break;
						case 4:
							System.out.println(number1 + "/" + number2 + "=" + (number1 / number2));
							break;
						case 5:
							System.out.println(number1 + "%" + number2 + "=" + (number1 % number2));
							break;
						case -1:
							wannaContinue = false;
						default:
							System.out.println("invalid operator");
					}
					break;
				}
	
				
			} else {
				System.out.println("user denied!");
				counter++;
			}
		}
		System.out.println("Program Finshed");
	}
}
