package week5_lab;
import java.util.Scanner;

public class Lab2 {
	public static void main(String[] args) {
	    System.out.println("Please Write The Weight: ");
	    Scanner weightInput = new Scanner(System.in);
	    int weight = weightInput.nextInt();
	    
	    System.out.println("Please Write The Height: ");
	    Scanner heightInput = new Scanner(System.in);
	    double height = heightInput.nextDouble();

	    
	    double bmi = weight / (height * height);
	    
	    System.out.println("Your Weight =  " + weight + " KG");
	    System.out.println("Your Height =  " + height + " CM");
	    System.out.println("Your body mass index is:  " + bmi);

	    if (bmi < 20) {
	    	System.out.println("You are thin.");
	    } else if(20 <= bmi && bmi < 25) {
	    	System.out.println("You are ordinary weighted.");
	    } else if (25 <= bmi && bmi < 40) {
	    	System.out.println("You are obese.");
	    } else if (bmi >= 40) {
	    	System.out.println("You have morbid obesity. You should go to a doctor.");
	    } 
	}
}
