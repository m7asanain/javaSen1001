package week7_sec2;

public class RandomMethod {

	public static void main(String[] args) {
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.pow(3, 2));
		System.out.println(Math.sqrt(9));
		System.out.println(Math.min(100, 10));
		
		int result = min(50, 40);
		System.out.println(result);
		
//		inline if
		System.out.println(50 > 60 ? "yes":"no");
		if(50>60)
			System.out.println("yes");
		else
			System.out.println("no");
	}

	public static int min(int i, int j) {
		if (i < j) {
			return i;
		} else {
			return j;
		}
		
//		return (i < j) ? i : j;
	}

}
