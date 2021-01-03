import java.util.Scanner;
public class QuestionTwo {

	public static void main(String[] args) {
	    
		System.out.println("Enter a number: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
//		System.out.println(number + " × " + 1 + " = " + (number * 1));
//		System.out.println(number + " × " + 2 + " = " + (number * 2));
//		System.out.println(number + " × " + 3 + " = " + (number * 3));
//		System.out.println(number + " x " + 4 + " = " + (number * 4));
//		System.out.println(number + " x " + 5 + " = " + (number * 5));
//		System.out.println(number + " x " + 6 + " = " + (number * 6));
//		System.out.println(number + " x " + 7 + " = " + (number * 7));
//		System.out.println(number + " x " + 8 + " = " + (number * 8));
//		System.out.println(number + " x " + 9 + " = " + (number * 9));
//		System.out.println(number + " x " + 10 + " = " + (number * 10));
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(number + " × " + i + " = " + (number * i));
		}
	}
}
