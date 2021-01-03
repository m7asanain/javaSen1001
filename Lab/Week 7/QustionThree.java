import java.util.Scanner;
public class QustionThree {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.println("Press 1 for left alignment or 2 for right alignment");

	    int number = input.nextInt();
	    
	    if (number == 1) {
	    	for (int i = 0; i < 5; i++) {
				for (int j = 0; j <= i; j++) {
				    System.out.print("*");
				}
			    System.out.println("");
			}
		} else if (number == 2) {
	    	for (int i = 0; i < 5; i++) {
				for (int j = 6; j > i; j--) {
				    System.out.print(" ");
				}
				for (int j = 0; j <= i; j++) {
				    System.out.print("*");
				}
			    System.out.println("");
			}
		} else {
		    System.out.println("Invalid Input!");
		}

	 }
}