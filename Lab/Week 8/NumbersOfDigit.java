package week8_lab;

import java.util.Scanner;

public class NumbersOfDigit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.println("Enetr your number: ");
	    int number = input.nextInt();
	    int numOfDigitl = digitNumberMethod1(number);
	    System.out.println("DigitNumberMethod1:  " + numOfDigitl);
	    
//	    System.out.println("DigitNumberMethod1: " + digitNumberMethod1(number));
//		digitNumberMethod1(0);
//		digitNumberMethod2();
	    
//	    System.out.println("DigitNumberMethod1: " + digitNumberMethod2(number)); --> can't call it here
	    digitNumberMethod2(number);
	}
	
	public static int digitNumberMethod1(int number) {
		int counter = 0;
		while (number > 0) {
			number = number / 10;
			counter++;
		}
		return counter;
	}
	
	public static void digitNumberMethod2(int number) {
		int counter = 0;
		while (number > 0) {
			number = number / 10;
			counter++;
		}
	    System.out.println("DigitNumberMethod2 : " + counter);	
	}

}
