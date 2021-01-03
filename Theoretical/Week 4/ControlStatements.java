package week4_sec2;
import java.util.Scanner;

public class ControlStatements {
	
		public static void main(String[] args) {
			
//			grade
//			"passed" --> grade>60
//			"congrats."
//			"failed" --> grade<60
//			"try again"
			
//			int, double, char, String
//			boolean => true / false
			
			boolean temp = true;
			temp = false;
	
		int grade = 60;
		
		if (grade >= 60) {
			System.out.println("Passed!");
			System.out.println("Congrats.");
		} else {
			System.out.println("Failed!");
			System.out.println("Try again.");
		}
		
		System.out.println("---------------------------------------------------------------------");
		
//		90 - A
//		80 - B
//		70 - C
//		60 - D
//		<60 - F
		
		grade = 95;
		
		if (grade >= 90) {
			System.out.println("A");
			System.out.println("Well Done!");
		} else if (grade >= 80) {
			System.out.println("B");
		} else if (grade >= 70) {
			System.out.println("C");
		}  else if (grade >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
			System.out.println("Boooo!!");
		}
	
		System.out.println("---------------------------------------------------------------------");

		
//		SELF STUDY
//		get the grade from the user and then display the letter grade
		
//		Scanner input = new Scanner(System.in);
//		System.out.print("Type your grade here: ");
//		int writeThePoint = input.nextInt();
//		
//		if (writeThePoint >= 90) {
//			System.out.println("A");
//			System.out.println("Well Done!");
//		} else if (writeThePoint >= 80) {
//			System.out.println("B");
//		} else if (writeThePoint >= 70) {
//			System.out.println("C");
//		}  else if (writeThePoint >= 60) {
//			System.out.println("D");
//		} else {
//			System.out.println("F");
//			System.out.println("Boooo!!");
//		}
		
//		System.out.println("---------------------------------------------------------------------");
		
		int x = 6, y = 8;
		if (x > 5) {
			if (y > 5) {
				System.out.println("Bothof them bigger than 5!");
			}
		} else {
			System.out.println("Less than 5!");
		}
		
		System.out.println("---------------------------------------------------------------------");

		double radius = 3.5;
		
		if (radius <= 0) {
			System.out.println("invalid value : " + radius);
		} else {
			double area = radius * radius * 3.15;
			area = radius * radius * Math.PI;
			System.out.println("The area of the circle having the radius of " + radius + " is : " + area);
		}
	}
}