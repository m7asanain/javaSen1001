package week7_sec2;

import java.util.Scanner;

public class Methods2 {

	public static void main(String[] args) {
		countToN(5);
		countToN(4);
		countToN(3);
		countToN(2);
		countToN(1);
		System.out.print("---------");
		for (int i = 5; i >= 1; i--) {
			countToN(i);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me a number:");
		int givenStarsNumber = sc.nextInt();
		countToN(givenStarsNumber);
	}
	
	public static void countToN(int n) {
//		n = 12;
		for (int i = 1; i <= n; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
