package ch01.ex02;

public class IfExam5 {

	public static void main(String[] args) {

		/*
		 * 학점 계산(grade) 
		 * 90 : A, 80 : B, 70 : C, 60 : D, 59점이하 : F 'IfExam4'와 동일한 내용이나 잘 보이기 위한 본
		 */
		int grade = 56;
	      
	      if(grade >= 90) {
	         System.out.println("A");
	      }else if(grade >= 80) {
	    	  System.out.println("B");
	      }else if(grade >= 70) {
	    	  System.out.println("C");
	      }else if(grade >= 60) {
	    	  System.out.println("D");
	      }else {
	    	  System.out.println("F");
	      }
	      
	      System.out.println("종료");
	}
}
