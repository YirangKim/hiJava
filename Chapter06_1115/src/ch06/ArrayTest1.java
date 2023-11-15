package ch06;

import java.util.Scanner;

public class ArrayTest1 {

	public static void main(String[] args) {
		
		int[] korscores = new int [10]; //배열 인스턴스 생성
		
		Scanner sc = new Scanner(System.in); //Scanner class 주소
				
		// 배열 요소값 대입
		for( int i=0; i <10; i++){
			korscores[i] = sc.nextInt();
		}
		
//		korscores[0] = 68;
//		korscores[1] = 65;
//		korscores[2] = 86;
//		korscores[3] = 91;
//		korscores[4] = 65;
//		korscores[5] = 78;
//		korscores[6] = 96;
//		korscores[7] = 76;
//		korscores[8] = 82;
//		korscores[9] = 75;
		
		int 합계 = 0; //초기값 
		float 평균 = 0f;
		
		// 합계구하기 for문
		for (int i=0; i<10; i++) {
			합계 += korscores[i];
		}
		
		System.out.println(합계);
		
		평균 = 합계/korscores.length;
		System.out.println(평균);
		//System.out.println("평균 + " + 합계/korscores.length + "점 입니다.");
	}

}
