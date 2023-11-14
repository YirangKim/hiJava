package ch04;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 >>");
    	int score;
		score = sc.nextInt();

		if (score >= 60) {
            System.out.println("PASS");
        } else {
            System.out.println("NO PASS");
        }
		
		// 저장소 정의(자료형과 변수이름 지정), 초기화 91
		// int score = 91;
		// 조건식은 score가 60과 같거나 크면 true, 작으면 false
		// if ( score >= 59); {
		// System.out.println("PASS");
		//}
		 
	}

}
