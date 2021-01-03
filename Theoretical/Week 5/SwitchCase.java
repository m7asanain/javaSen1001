package week5_sec2;

public class SwitchCase {

	public static void main(String[] args) {
		char grade = 'B';
		switch (grade) {
		case 'A':
			System.out.println("Well done");
			System.out.println("You get an A");
			break;
		case 'B':
			System.out.println("You get B");
			break;
		case 'C':
			System.out.println("You get C");
			break;
		case 'D':
			System.out.println("You get D");
			break;
		case 'F':
			System.out.println("You get F");
			break;

		default:
			System.out.println("invalid grade");
		}
		
		String name="ab";
		
		switch (name) {
		case "ab":
			break;
		case "ba":
			break;
		case "sdfjksdf":
			break;
		default:
		}
	}

}
