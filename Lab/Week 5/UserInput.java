package week5_lab;
import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	    System.out.println("Enter Your Name: ");
		String name = input.next();
//	    System.out.println("Username is " + name);
	    
	    System.out.println("Enter Your Age: ");
	    int age = input.nextInt();
	    System.out.println("Hello I'm " + name + ", I'm " + age + " Years old!");

	}
}