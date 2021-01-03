package week2_sec2;

public class Week2 {
	public static void main(String[] args) {
		System.out.println("Hello World");
//		println - use to print in a new line
		System.out.println(234);
		System.out.println("Hello to JaVa");
		System.out.println("Hello to JaVa");
		
//		print - use to print in a same line
		System.out.print("My name is Mustafa ");
		
		System.out.println("Hello again");
		
		System.out.println("---------");

		System.out.println("Line1");
		System.out.print("Line2");
		System.out.print("Line3");
		System.out.println("Line4");
		
		System.out.println("---------");

//		\ -> escape char.
//		\n -> write in a new line
//		\t -> write in a new line with tab space
		
		System.out.println("Line1");
		System.out.println("Line2");
		System.out.println("Line3");
		
		System.out.println("Line1\nLine2\nLine3");
		System.out.println("Line1\tLine2\tLine3");
		
		System.out.println("Line1\\Line2\\Line3");
		
		System.out.println("\"Mustafa\"");
		
		System.out.println("---------");
		
		
//		Variables
		
//		String -> text, a date type
//		integers, int -> whole numbers

		int number1 = 2;
		int x = -3;
		int a = 0;
		int A = 12;
		
		System.out.println(x + a + A);
		
		String name = "Ummu";
		name = "1234";
		System.out.println(name + A);
		
		String n;
		n = "Mustafa Alkamali";
		System.out.println(n);
		System.out.println(name);
		System.out.println(number1);
		String myText = "My Working Hours";

		
		System.out.println("-----CONFUSING-----");
		

		System.out.println("5 + 5");
		System.out.println("5" + 6);
		System.out.println("5 " + 6);
		System.out.println("5" + "" + 6);
		System.out.println("5" + 6 + 4);
		System.out.println("5" + (6 + 4));
		System.out.println(6 + 4 + "5");
		System.out.println("5" + (6 - 4));
		
		System.out.println("---------");

		String color = "Blue";
		System.out.println("My Favorite Color is: " + color);
		System.out.println("---------");
		int currentYear = 2020;
		int birthday = 2000;
		int age = currentYear - birthday;
		System.out.println("Doga is " + age + " Years old!");
		System.out.println("Doga is " + (currentYear - birthday) + " Years old!");

	}
}
