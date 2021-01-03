package week6_sec2;
import java.util.Scanner;

public class Loop2Lec {

	public static void main(String[] args) {
		int addition = 0, count = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number");
		float number = input.nextInt();
		
		while (number != -1) {
			addition += number;
			count ++;
			System.out.println("Enter Number");
			number = input.nextInt();
		}
		System.out.println("The average is = " + (addition / count));
	}

}
	