import java.util.Random;

public class Review {

	public static void main(String[] args) {
		
		int x = 5;
		
		int[] myArray = new int[5];		// 0 | 0 | 0 | 0 | 0
		int arr[] = {1, 2, 3, 4, 5};	// 1 | 2 | 3 | 4 | 5
		
		fillArray(myArray);
		
//	    System.out.println("Hello World");
//
//		fillArray(myArray);
		
		
	    System.out.println("BEFORE");
		for (int i = 0; i < myArray.length; i++) {
//		    System.out.println(myArray[i]);
			printArray(myArray);
		}
	    System.out.println("AFTER");
		fillArray(myArray);
		for (int i = 0; i < myArray.length; i++) {
//		    System.out.println(myArray[i]);
			printArray(myArray);
		}
	}
	
	public static void printArray(int b[]) {
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
	
//	fill a given array with random number
	public static void fillArray(int a[]) {
		
		Random r = new Random();
		r.nextInt();		 // -2 ^ 19, 2 ^19
		r.nextInt(10);		// min: 0 - max: 10 - 1  = 9
		r.nextInt(100);		// min: 0 - max: 100 - 1  = 99
		
		for (int i = 0; i < a.length; i++) {
//			a[i] = (int)Math.random() * 23 + 12;		// 0 - 1
			a[i] = r.nextInt(50);
		}
	
	}

}
