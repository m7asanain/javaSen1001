package week4_sec2;
import java.util.Scanner;

public class Addition {
	
//	program begins
	public static void main(String[] args) {
		
//		lang - basics => all basics of the language
//		util - utilit => for date and time / get input from the users
//		awt - GUI => for graphical part
		
		Scanner input = new Scanner(System.in);
		int a = 5;
		
		System.out.println("argument");
		
		int number1, number2;
//		prompt
		System.out.print("enter number 1: ");
		number1 = input.nextInt();
		
		System.out.print("enter number 2: ");
		number2 = input.nextInt();
		
		
		System.out.print("The sum of number1 and number2 = " + (number1 + number2));
	}

}