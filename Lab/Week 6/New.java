package week6_lab;
import java.util.Scanner;

public class New {

	public static void main(String[] args) {
		System.out.println("Write the number: ");
		Scanner input = new Scanner(System.in);
		int inputNumber = input.nextInt();
		boolean isPrime = true;
		int temp;
		input.close();
		
		for (int i = 2; i <= inputNumber / 2; i++) {
			temp = inputNumber % i;
			if (temp == 0) {
				isPrime = false;
				break;
			}
			if (isPrime) {
				System.out.println("This number is prime");
				System.out.println("");
			} else  {
				System.out.println("This number is not prime");
				System.out.println("");
			}
			
		}

	}

}
