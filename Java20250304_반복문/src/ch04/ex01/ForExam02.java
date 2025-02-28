package ch04.ex01;

public class ForExam02 {

	public static void main(String[] args) {

		// 블럭만 수정하여 1~100까지 홀수 합을 구하라.
		
		int sum = 0; 
		
		for(int i=1; i <= 100; i++) { // i=1 초기값, i <= 100 조건, i++ 증가
			if(i % 2 == 1) {
				sum += i;
				
			}
		}
		
		System.out.println("sum = " + sum);
	}

}
