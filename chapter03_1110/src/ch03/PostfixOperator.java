package ch03;

public class PostfixOperator {

	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = num1++; //대입 연산 후 num1값 1 증가시킴
		
		System.out.println("num1 값 :" + num1);
		System.out.println("num2 값 :" + num2);
		System.out.println("num1++ 값 :" + num1++ );

	}

}
