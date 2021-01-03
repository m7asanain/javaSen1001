package week5_sec2;

public class PrePost {

	public static void main(String[] args) {
		int a=5;
		System.out.println(a);	//5
		a=a+1;
		System.out.println(a);	//6
		System.out.println(a+1);	//7
		System.out.println(a);	//6
		
		a++;
		System.out.println(a);	//7
		++a;
		System.out.println(a);	//8
		a--;
		System.out.println(a);	//7
		
		
		a=5;
		
		System.out.println(a++);
		//a=6
		//a=7
		System.out.println(++a);
		
		//++a -->pre increamnet
		//a++ --> post increment
		
		a=7; //8+1=9
		int b= a++ + ++a;
		
		
		System.out.println(b);
	}

}
