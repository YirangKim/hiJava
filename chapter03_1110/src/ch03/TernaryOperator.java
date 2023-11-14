package ch03;

public class TernaryOperator {

	public static void main(String[] args) {

		int num1 = 2;
		int num2 = 5;
		
		int min = ( num1 < num2 ) ? num1 : num2;
		System.out.println(min);

		int max = ( num1 > num2 ) ? num1 : num2;
		System.out.println(max);
		
		// %2 2로 나누기
		String result = ( num1 % 2 == 0 ) ? "짝수" : "홀수";
		System.out.println(result);
		
		result = ( num2 % 2 == 0 ) ? "짝수" : "홀수";
		System.out.println(result);
	}

}
