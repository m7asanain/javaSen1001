package week8_sec2;

public class References {

	public static void main(String[] args) {
		
		int a = 5;
		System.out.println("Before Method call: " + a );
		TryToChange(a);
		System.out.println("After Method call: " + a );
		TryToChange2(a);
		System.out.println("After Method call: " + a );
		
		int myArray[] = {1,2,3};
		System.out.println("BEFORE");
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
		TryToChange3(myArray);
		System.out.println("AFTER");
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
	}
	
//	primitive -- int double, bloolean, char, short, byte, long, float.
//	non-primitive, Array, String ... -- > reference type
	
	public static void TryToChange(int b) {
		b = 50;
	}
	
	public static int TryToChange2(int b) {
		return 50;
	}
	
	public static void TryToChange3(int[] b) {
		b[0] = 50;
	}

}
