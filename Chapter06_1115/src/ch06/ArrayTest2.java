package ch06;


public class ArrayTest2 {

	public static void main(String[] args) {
		
		int[] score1 = {100, 90, 70, 80, 55};		
		int[] score2 = new int[]{100, 90, 70, 80, 65};
		String[] name = { "홍길동", "강감찬", "이순신", "권율", "을지문덕" };
		String[] 과목 = { "국어", "영어", "수학", "과학", "기술" };
		
		과목[2] = "음악";
		
//		int score3;
//		score3 = new int[]{100, 90, 70, 80, 65};
		
		System.out.println(score1[0]);
		System.out.println("score1은 =");
		for ( int i=0; i < score1.length; i++) {
			System.out.print(score1[i] + "\t");
		}
		System.out.println(score2[1]);
		System.out.println("score2는 =");
		for ( int i=0; i < score1.length; i++) {
			System.out.print(score2[i] + "\t");
		}
		
		
//		System.out.println(score3[1]);
		
		System.out.println(" ");
		for ( char i=0; i < name.length; i++) {
			System.out.print(name[i] + "\t");
		}
		
		System.out.println(" ");
		for ( char i=0; i < 과목.length; i++) {
			System.out.print(과목[i] + "\t");
		}


	}

}
