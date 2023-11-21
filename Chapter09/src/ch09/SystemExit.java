package ch09;

import java.util.Scanner;

public class SystemExit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력하세요 >> ");
		
		while(true) {
			int num = sc.nextInt();
			if( num == 0 ) {
				System.out.println("콘솔에 텍스트를 출력합니다");
			} else if( num == 1) {
				break; // 탈출
			} else if ( num == 2 ) {
				System.out.println("프로그램을 종료합니다");
				System.exit(0);
			}
		
		}
		System.out.println("반복문 종료");		
				
		}

}
