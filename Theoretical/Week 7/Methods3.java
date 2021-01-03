package week7_sec2;

public class Methods3 {

	public static void main(String[] args) {
		drawRectangle('@', 5, 3);
		drawRectangle('#', 20, 40);
//		drawRectangle(20,'a', 40); --> not going to work
		
		drawTriangle(4, "*");
		
		addNumbers(3.2, 6.7);
		addNumbers(5, 6);
		
		calculate('*', 4, 2.2);
		calculate('+', 4, 2.2); // go finds the method, execute it, come back where I called it
		
//		System.out.println(addNumbers(3, 5)); --> doesn't work
		
	}
	
	public static void addNumbers(double n1, double n2) {
		System.out.println(n1 + n2);
	}
	
	public static void calculate(char operator, double n1,double number2) {
		switch (operator) {
		case '+':
			addNumbers(n1, number2);
			break;
		case '-':
			System.out.println(n1 - number2);
			break;
		case '*':
			System.out.println(n1 * number2);
			break;
		case '/':
			System.out.println(n1 / number2);
			break;
		default:
			System.out.println("invalid");
		}
	}
	
//	drawRectangle
	public static void drawRectangle(char symbol, int row, int column) {
		for (int i = 0; i < row; i++) { // row
			for (int j = 0; j < column; j++) { // column
			    System.out.print(symbol);
			}
		    System.out.println();
		}
	}
	
	//**** i = 0, r = 4 --> 4 r - i ? 4 - 0 = 4
	//*** i = 1, r = 4 --> 3 r - i = 4 - 1 = 3
	//** i = 2, r = 4 --> 2 4 - 2 = 2
	//* i = 3, r = 4 --> 1 4 - 3 = 1
	
	public static void drawTriangle(int row, String symbol) {
//		System.out.println(row);
		for (int i = 0; i < row; i++) {
			for (int j = row - i ; j >= 1 ; j--) {
				System.out.print(symbol);
			}
			System.out.println();
		}
	}
}