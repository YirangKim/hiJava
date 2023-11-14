package ch04;

import java.util.Scanner;

public class IfelseIfTest {

	public static void main(String[] args) {
		

	// Scanner를 이용해서 데이터 입력
	// 90점 이상이면 A, 80점 이상이면 B, 70점 이상이면 C, 60점이상이면 D,
	// 60미만이면 F
		
    	int score;
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요 >>");
		score = sc.nextInt();
		
		if ( score >= 90 ) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		}  else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

		
//		int score = 60;
//		if ( score >= 90 ) {
//			//조건1 참일 때 실행
//			System.out.println("A");
//		} else if (score >= 80) {
//			//조건 1 거짓, 조건2 참일 때 실행
//			System.out.println("B");
//		} else {
//			// 조건1, 2 모두 거짓일 때 실행
//			System.out.println("C");
//		}

	}

}
