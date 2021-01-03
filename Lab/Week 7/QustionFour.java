import java.util.Scanner;

public class QustionFour {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter a number 1 to 15");
	    int numberOfLine = input.nextInt();
	    
	    for (int rows = 1; rows <= numberOfLine; rows++) {
			for (int j = numberOfLine - rows; j >= 1; j--) {
			    System.out.print("  ");
			}
			for (int j = rows; j >= 2; j--) {
			    System.out.print(j + " ");
			}
			for (int i = 1; i <= rows; i++) {
			    System.out.print(i + " ");
			}	
			
		    System.out.println("");

	    }
	}

}
