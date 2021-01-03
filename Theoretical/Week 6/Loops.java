package week6_sec2;

public class Loops {

	public static void main(String[] args) {
		
		int number = 1;
		
		while (true)  {
			if (number % 7 == 0) {
				System.out.println(number);
			}
			if (number == 1000) {
				break;
			}
			number++;
		}
		
	}

}
