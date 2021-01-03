package week5_lab;
import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		int longEdge, shortEdge, area, perimeter;
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter The Long Edge: ");
	    longEdge = input.nextInt();
	    System.out.println("Enter The Short Edge: ");
	    shortEdge = input.nextInt();
//	    area = longEdge * shortEdge;
//	    perimeter = 2 * (longEdge + shortEdge);
	    System.out.println("The Area = " + (longEdge * shortEdge));
	    System.out.println("The Perimeter = " + (2 * (longEdge + shortEdge)));

	}
}