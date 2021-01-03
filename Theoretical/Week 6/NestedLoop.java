package week6_sec2;
import java.util.Scanner;

public class NestedLoop {

	public static void main(String[] args) {
		
//		***
//		***
//		***
		
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
		
//		for (int i = 0; i < 3; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		for (int i = 0; i < 3; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		for (int i = 0; i < 3; i++) {
//			System.out.print("*");
//		}
//		System.out.println();
		
//		for (int i = 0; i < 10; i++) { // Rows
//			for (int j = 0; j < 5; j++) { // Column
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		Scanner input = new Scanner(System.in);
//		
//		System.out.println("How many rows");
//		int rows = input.nextInt();
//		System.out.println("How many column");
//		int colums = input.nextInt();
//		System.out.println("Enter the symbol");
//		int symbol = input.nextInt();
//		
//		for (int i = 0; i < rows; i++) { // Rows
//			for (int j = 0; j < colums; j++) { // Column
//				System.out.print(symbol);
//			}
//			System.out.println();
//		}
		
//		SELF STUDY
		
//		System.out.println("How many rows");
//		int rows = input.nextInt();
//		System.out.println("How many column");
//		int colums = input.nextInt();
		
		for (int i = 0; i < 5; i++) { // Rows
			for (int j = 0; j < 1; j++) { // Column
				System.out.print("*");
			}
			System.out.println();
			for (int j = 0; j < 2; j++) { // Column
				System.out.print("*");
			}
			System.out.println();
			for (int j = 0; j < 3; j++) { // Column
				System.out.print("*");
			}
			System.out.println();
			for (int j = 0; j < 4; j++) { // Column
				System.out.print("*");
			}
			System.out.println();
			for (int j = 0; j < 5; j++) { // Column
				System.out.print("*");
			}
			System.out.println();
		}
		
	
	}

}
