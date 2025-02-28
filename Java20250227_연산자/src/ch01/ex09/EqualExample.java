package ch01.ex09;

public class EqualExample {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 10;
		
		String str1 = "korea";
		String str2 = "korea";
		
		System.out.println(num1 == num2);
		System.out.println(str1 == str2);
		
		String str3 = new String("korea");
		String str4 = new String("korea");
		
		
		System.out.println(str3 == str4);
		System.out.println(str1.equals(str4));
		
		System.out.println((5>1) ^ (3>4));
		System.out.println(! (5==2));
	}

}
