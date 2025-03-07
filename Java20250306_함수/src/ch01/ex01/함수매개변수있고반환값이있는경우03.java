package ch01.ex01;

public class 함수매개변수있고반환값이있는경우03 {


	/*
		*********함수**********
		입력(매개변수)     출력(반환값)
			O              O -> 해당 건의 예제
			O              X
			X              O
			X              X
			함수 정의 -> 함수를 만드는 것
			함수 호출 -> 만든 함수를 실행하는 것
			1. 함수이름은 변수와 동일하게 임의로 정함.
			2. int sum = 100 == sum(100) 두 개의 의미는 같다.
			3. 호출 시에는 받아주는게 꼭 필요하다.(sum(100)으로 호출 시 sum(int num)으로 받아줌
			4. 호출 갯수와 받아주는 갯수는 동일해야한다.(sum(10, 20)으로 호출 시 sum(int num1, int num2)으로 갯수를 맞춘다.
			5. 호출 타입과 받아주는 타입은 동일해야한다.(sum(10, 10.2)으로 호출 시 sum(int num1, double num2)으로 정수, 실수, flag(참/거짓) 등 호출에 따라 타입을 맞춘다.
			6. 호출 순서와 받아주는 순서는 동일해야한다.(sum(5.6, 4)으로 호출 시 sum(double num2, int num1)으로 실수를 먼저 호출할 경우 실수로 받아 순서를 맞춘다.
			7. 함수 호출 타입, 매개 변수(public static ??), 출력 값의 타입은 일치해야한다.
*/

		public static void main(String[] args) { //진입점 반드시 있어야함
			
		int result = sum(10, 20); //함수 호출, 10은 인자값으로 불림, 매체 변수와 타입이 일치해야함.
//		위에 내용 코드 실행화면 결과는 int result = 30; 이렇게 나온다.
		System.out.println(result);
		System.out.println("프로그램 종료!!");
	}
	
//			함수 정의
			public static int sum(int n1, int n2) { // 매개 변수, sum(??) 값이 여기로 들어옴.
//			public static ?(타입: int, void, double 등) 
//				void 타입으로 기재될 경우 출력값인 return이 필요 없으나, int/double/flag는 return이 만드시 기재되어야함.
//			코드 구현
				System.out.println("voud sum(int n1, int n2) 함수 호출!!");
				
				return n1+n2; //return: 값을 변환한다.(n1,정수+n2,정수 = 정수값) 매개 변수의 타입과 일치해야 함.
//				return에는 오직 1개의 값만 전달이 가능하다.(n1 + n2 외 다른 값 출력 불가)

//			25번째, 31번째, 36번째 항목은 정수, 실수 등의 타입이 일치해야함.
				
//				1. 함수호출 2. 매개변수 3. 출력 순서로 기재
	}

}
