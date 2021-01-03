package week7_sec2;

public class Methods1 {
	
//	Class Body
	
	public static void main(String[] args) {
//		whitespace
		System.out.println("-welcome---");
//		calling method/invoke
		printStars(50);
		printStars(20);
		System.out.println();
		System.out.println("-----");
		System.out.println();
		
	}
	
//	method header
//	public static [return type] [name] ([parameter list]) 
//	method body}
	
	public static void printStars(int numberOfStatrs) {
		for (int i = 0; i < numberOfStatrs; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}