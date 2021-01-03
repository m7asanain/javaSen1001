package week8_sec2;

public class RandomGeneration {

	public static void main(String[] args) {
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println(Math.random());	// [0-1)
			}
		}
		
		double x=Math.random(); //0-1
//		0 - 1 --> 1 - 6 ?
//		min : 0.0000 * 6 = 0.0000 + 1 = 1
//		max : 0.9999 * 6 = 5.499 + 1 = 6.99
		
		x *= 6;
//		x++;
		System.out.println((int) ++x);	// casting
		System.out.println("------");
		
		generateRandom();
		System.out.println("------");
		
		generateRandom(4);
		System.out.println("------");
		
		for (int i = 0; i < 15; i++) {	
			int result=	generateRandom(10, 2);
			System.out.println(result);
		}
	}
	
	public static void generateRandom() {
		System.out.println(Math.random());
	}
	
//		method overloading
//		0 - max
		public static void generateRandom(int max) {
			System.out.println(Math.random() * max);
		}
		
//		[min-max]
		public static int generateRandom(int max, int min) {
//			System.out.println((int )(Math.random() * (max - min + 1)) + min);
			return (int)(Math.random() * (max - min + 1)) + min;
		}

}
