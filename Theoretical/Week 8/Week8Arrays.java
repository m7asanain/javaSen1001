package week8_sec2;

import java.util.Scanner;

public class Week8Arrays {

	public static void main(String[] args) {
		int x = 6; // variable -> only one single value
		
		int[] myArray;
		myArray = new int[4];
		myArray[0] = 10;
		myArray[1] = -4;
		myArray[2] = 100;
		myArray[3] = 2;
//		myArray[4] = 2; --> Doesn't work
		
		int b[] = new int[5];	// 0 | 0 | 0 | 0 | 0
		int c[] = {1, 2, 3, 4, 5};
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
//		System.out.println(c[5]); --> Doesn't work
		System.out.println("Number of elements in c is " + c.length);
		System.out.println(c[c.length - 1]); // maximum index number we can use
		System.out.println("-----------");
		
		String []seasons = {"summer", "winter", "spring", "autumn"};
		System.out.println(seasons.length);
		System.out.println(seasons[0]);
		System.out.println(seasons[1]);
		System.out.println(seasons[2]);
		System.out.println(seasons[3]);
		
		System.out.println("------");
		
		for (int i = 0; i < seasons.length; i++) {
			System.out.println(seasons[i]);
		}
		
		System.out.println("------");

		String cities[] = new String[3];	// null | null | null
		System.out.println(cities[0]);
		cities[1] = "istanbul";
		cities[2] = "antalya";
		for (int i = 0; i < cities.length; i++) {
			System.out.println(cities[i]);
		}
		
		System.out.println("------");
		
//		3 numbers from the user - grade - M1 M2 F
//		store them in an array
//		caculate the avg
		
		double avg = 0;
		Scanner input = new Scanner(System.in);
		int [] grades = new int[3];
		for (int i = 0; i < grades.length; i++) {
			System.out.println("Enter grade " + (i+1));
			int gra = input.nextInt();
			grades[i] = gra;
			avg += grades[i];
		}
		System.out.println("The avg is " + avg/grades.length);
	}

}
