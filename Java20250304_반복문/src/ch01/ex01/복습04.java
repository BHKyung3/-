package ch01.ex01;

import java.util.Scanner;

public class 복습04 {

	public static void main(String[] args) {
		
		// 객체   참조변수
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력>>");
		int number = sc.nextInt();
		
		String msg = "";
		if(number >= 0) {
			msg = "양수";
		}else {
			msg = "음수"; {
					
			}
		}
	
		System.out.println(msg);
	}
}
