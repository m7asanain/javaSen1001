package week7_sec2;

public class Methods4 {

	public static void main(String[] args) {
		int returnedValue = method1();
		System.out.println(returnedValue);
		
		String message = method2();
		System.out.println(message);
//		System.out.println(method2());
		
		System.out.println(add(3.4, 6.4));
		double result = add(-2.2, 5);
		System.out.println(result * 2);
		
//		add(-2.2,5);
		
		System.out.println(method2(30));

	}
	
	public static int method1() {
		return 50;
	}
	
	public static String method2() {
		return "Hello from method2";
	}
	
//	method overloading
	
	public static double add(double n1, double n2) {
		return n1 + n2;
	}
	
	public static int add(int n1, double n2) {
		return (int)(n1 + n2);	//	casting
	}
	
	public static int add(int n1, int n2) {
		return n1 + n2;
	}
	
	public static String method2(int a) {
		String  s = "";	// ***
		for (int i = 0; i < a; i++) { 	// 0, 1, 2
			s += "*";
		}
		return s;
	}

}
