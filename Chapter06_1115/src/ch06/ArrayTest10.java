package ch06;

import java.util.Scanner;

public class ArrayTest10 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner( System.in);
		
		int i;
		int j=0;
		
		String[] num2 = new String[5];
		String[] x = {"첫", "두", "세", "네", "다섯"};
		
		for(i=0; i<5; i++ ) {
			System.out.println("이름을 입력하세요 >>" );
			num2[i] = sc.nextLine();
		}
		
//		int[] num = new int[5];
//		
//		for (int i=0; i<5; i++) {
//			System.out.print( i+1 + "개를 입력하세요 ");
//			num[i] = sc.nextInt();
//		}
	
		int[][] num1 = new int[3][3];
		

		
		for ( i=0; i< num1.length; i++ ) { //행 num1.length
			for ( j=0; j < num1[0].length; j++ ) { //열 num1[0].length
				System.out.println("점수를 입력하세요 >>" ); //출력
				num1[i][j] = sc.nextInt(); //입력
			}	
		}
		
		
		for ( i=0; i< num1.length; i++ ) { //행 num1.length
			for ( j=0; j < num1[0].length; j++ ) { //열 num1[0].length
				System.out.println( num1[i][j] + "\t");
				num1[i][j] = sc.nextInt();
			}	
		}
				
//		System.out.println("이름 ㅣ 국어 ㅣ 수학 ㅣ 영어 ㅣ 과학 ㅣ 기술 ");
//		System.out.println("===================================");
	}

}


//[0][0] [0][1] [0][2]
//[1][0] [1][1] [1][2]
//[2][0] [2][1] [2][2]

//for ( int[] y : num1 ) {
//	for( int a : y) {
//		System.out.print( "[" + y +"] "+ "[" + a +"]");
//		num[i] = sc.nextInt();
//		
//	}