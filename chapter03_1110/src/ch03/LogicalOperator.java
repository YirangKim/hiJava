package ch03;

//
import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); // 객체 생성 메모리 저장해서 프로그램 호출 
		
		System.out.print("숫자를 입력하세요 >>"); // 그래서 뭘 입력할건데?
		
		// num1
		// int 정수
		int num1, num2;
		
		num1 = in.nextInt(); // 메소드 실행하면 scanner에 의해서 저장될 수 있도록 실행
	
		// num2 반복 
		System.out.print("두번째 숫자를 입력하세요>>");
		num2 = in.nextInt();

		System.out.println( num1 > 10 && num1 < 50); // 두개의 결과가 모두 true일 경우 결과는 true
		System.out.println( num1 < 10 && num1 < 50); // num1이 10보다 크기 때문에 false
		System.out.println( num1 > 10 || num2 > 10); // true
		System.out.println( num1 < 10  || num2> 10 ); //false

	}

}
