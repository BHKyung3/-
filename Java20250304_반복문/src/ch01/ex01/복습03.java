package ch01.ex01;

import java.util.Scanner;

public class 복습03 {

	public static void main(String[] args) {
		
		// 객체   참조변수
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력>>");
		int number = sc.nextInt();
		
		// 삼향연산자(조건연산자)
				
		// (조건1) ? 참 : (조건2) ? 참 : 거짓;
		String msg2 = (number > 0) ? "양수" : number > 0 ? "영" : "음수";
	
		System.out.println(msg2);
	}
}
