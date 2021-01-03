package week5_sec2;
import java.util.Scanner;

public class Review {

	public static void main(String[] args) {
		int grade = 88;
		if (grade >= 90) {
			System.out.println("My father will be so angry");
		} else if (grade >= 60) {
			System.out.println("that is okey");
		} else {
			System.out.println("He will give me money");
		}
			
//		<, >, <=, >=,
//		== -> if two values are equal or not
//		3==5 -> false
//		3==3 ->true
//		a=5 -> assignment
		
		int a = 5, b = 5;
		System.out.println(a == b);
		
//		!= --> if two values are not equal
//		3!=5 -> true
//		3!=3 -> false
		
		int number = 3 + 5 * 2 - 10 / 2; // 3 + 10 - 5 = 8
		
//		% -- mod -- the remainder when you divide a number by another number
//		5 % 3 -- 2
//		10 % 2 -- 0
		
		int newNumber = 2;
		if (newNumber % 2 == 0) {
			System.out.println("even number");
		} else if(newNumber % 5 == 0) {
			System.out.println("divisble by 5");
		} else {
			System.out.println("odd number");
		}
		
		if (newNumber % 2 == 0 && newNumber % 3 == 0 && newNumber % 5 != 0) {
			System.out.println("divisible by 2 and 3 but not 5");
		}
		
		if (newNumber % 2 == 0 || newNumber % 3 == 0 || newNumber % 5 != 0) {
			System.out.println("divisible by 2 or 3 or not 5");
		}
		
//		AND - &&
		
//		T & T -> T
//		T & F -> F
//		F & T -> F
//		F & F -> F
		
//		OR - ||
		
//		T || T -> T
//		T || F -> T
//		F || T -> T
//		F || F -> F
		
		String username = "hamza";
		String password =  "123345";
		Scanner input = new Scanner(System.in);
		
		if (username == "hamza" && password == "123345") {
			System.out.println("How old are you?");
			int age = input.nextInt();
			boolean canAccess = age >= 18;
			if (canAccess) { 
				System.out.println("welcome " + username);
				System.out.println("Your login succedded");
			} else {
				System.out.println("you are not old enough");
			}

		} else {
			System.out.println("invalid values");
		}

	}
}
