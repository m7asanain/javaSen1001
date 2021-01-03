package week6_lab;
import java.util.Scanner;

public class QuestionTwo {
	public static void main(String[] args) {
		
		for (;;) {
			
			System.out.println("Write the number: ");
			Scanner input = new Scanner(System.in);
			int inputNumber = input.nextInt();
			int divider = 2;
			int a = 1;
			
			if (inputNumber % divider == 0 || inputNumber < 2) {
				System.out.println("This number is prime");
				a = 2;
				System.out.println("");
			} else {
				System.out.println("This number is not prime");
				System.out.println("");
			}
			
		}
		
	}

}
