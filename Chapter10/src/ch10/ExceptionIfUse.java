package ch10;

import java.util.Scanner;

public class ExceptionIfUse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 두개를 입력");
		System.out.println("정수 > 1");
		int num1 = sc.nextInt();
		
		System.out.println("정수 > 1");
		int num2 = sc.nextInt();
		
		if (num2 == 0) {
			System.out.println("0으로 나누기 불가능");
			System.out.println("프로그램 종료");
			return;
		}
		System.out.println("num1/num2=" + (num1/num2));
	}

}



