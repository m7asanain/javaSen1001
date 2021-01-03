package week6_lab;
import java.util.Scanner;

public class QuestionOne {
	public static void main(String[] args) {
		System.out.println("Write the number: ");
		Scanner input = new Scanner(System.in);
		int inputNumber = input.nextInt();
		switch (inputNumber) {
		case 1:
			System.out.println("Monday");
		    break;
		 case 2:
				System.out.println("Tuesday");
		    break;
		 case 3:
				System.out.println("Wednesday");
			 break;
		 case 4:
				System.out.println("Thursday");
			break;
		 case 5:
				System.out.println("Friday");
			break;
		 case 6:
				System.out.println("Saturday");
			break;
		 case 7:
				System.out.println("Sunday");
			 break;
		
		  default:
			  System.out.println("Error - Please try another number!");
		}
	}
}
