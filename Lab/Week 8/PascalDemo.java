package week8_lab;

import java.util.Scanner;

public class PascalDemo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of rows");
		int rows = input.nextInt();
		int coef = 1;
		
		for (int i = 0; i < rows; i++) {
			for (int space = 1; space < rows - i; space++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				if (j == 0 || i == 0) {
					coef = 1;
//					System.out.print("");
				} else {
					coef = coef * (i - j + 1) / j;
					System.out.print(" " + coef);
				}
				System.out.println();
			}
		}
		 
		
	}

}
