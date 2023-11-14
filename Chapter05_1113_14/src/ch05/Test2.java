package ch05;

import java.util.Scanner;

public class 성적처리 {
	
	int 국어;
	int 영어;
	int 수학;
	int 과학;
	int 기술;
		
	public 성적처리(int 국어, int 영어, int 수학, int 과학, int 기술) {
		this.국어 = 국어;
		this.영어 = 영어;
		this.수학 = 수학;
		this.과학 = 과학;
		this.기술 = 기술;
	}
	
	// main 실행
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수를 입력하세요 >>");
		int a = sc.nextInt();
		
		System.out.println("영어점수를 입력하세요 >>");
		int b = sc.nextInt();
		
		System.out.println("수학점수를 입력하세요 >>");
		int c = sc.nextInt();
		
		System.out.println("과학점수를 입력하세요 >>");
		int d = sc.nextInt();
		
		System.out.println("기술점수를 입력하세요 >>");
		int e = sc.nextInt();
		
		성적처리 add = new 성적처리(a, b, c, d, e);
				
		int 총점 = add.국어 + add.영어 + add.수학 + add.과학 + add.기술;
		int 평균 = 총점 / 5;
		
		System.out.println("> 총 점수 : " + 총점 );
		System.out.println("> 평균 : " + 평균 );

	}
}
