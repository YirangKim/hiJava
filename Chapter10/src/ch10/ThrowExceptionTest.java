package ch10;

import java.util.Scanner;

public class ThrowExceptionTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수를 입력하세요");
		int score = sc.nextInt();
		
		try {
			
			if(!(score>= 0 && score < 100)) {
				Exception e = new Exception();
				throw e;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
