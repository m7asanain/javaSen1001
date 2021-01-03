package week6_sec2;
import java.util.Scanner;

public class CalculatorPlus {

	public static void main(String[] args) {
		
		System.out.println("Enter your userame and password");
		
		Scanner input = new Scanner(System.in);
		
		String systemUsername = "m7asanain", systemPassword = "asdf";
		
		String givenUsername = input.next();
		String givenPassword = input.next();
		System.out.println("Enter your age");
		int age = input.nextInt();
		boolean wannaContinue = true;
			
			int counter = 0;
			while (counter < 3) {
				if (givenUsername.equals(systemUsername) && givenPassword.equals(systemPassword) && age >= 20) {
					System.out.println("User Accepted!\n");
					System.out.println("Welcome to your calculator\nEnter your first number");
					int firstNumber = input.nextInt();
					
					System.out.println("Enter your second numNber");
					int secondNumber = input.nextInt();
					
					while (wannaContinue) {
						System.out.println("Select the operator");
						System.out.println("press 1 for +");
						System.out.println("press 2 for -");
						System.out.println("press 3 for *");
						System.out.println("press 4 for /");
						System.out.println("press 5 for %");
						System.out.println("press -1 to exit");
						
						int operator = input.nextInt();
						
						switch(operator) {
						
							case 1:
								System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
								break;
							case 2:
								System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
								break;
							case 3:
								System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
								break;
							case 4:
								System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
								break;
							case 5:
								System.out.println(firstNumber + " % " + secondNumber + " = " + (firstNumber % secondNumber));
								break;
							case -1:
								wannaContinue = false;
							default:
								System.out.println("Invalid Value!");
							}
					}
					break;
				} else {
					System.out.println("User Denied!");
					counter++;
				}
			}
		System.out.println("Program is finshed!");
	}
}