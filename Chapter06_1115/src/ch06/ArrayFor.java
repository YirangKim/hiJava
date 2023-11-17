package ch06;

public class ArrayFor {

	public static void main(String[] args) {
		
		// 배열 for 반복문
		// 점프04-04 for문
		
		int[] score = {90, 25, 67, 45, 80};
		
		for ( int i=0; i <score.length; i++ ) {
			if ( score[i] >= 60) { // score[i] ???
				System.out.println((i+1)+"번 학생 합격"); //i+1 번 학생 ???
			} else {
				System.out.println((i+1)+"번 학생 불합격");
			}
			
		}
		
//		String[] numbers = {"one", "two", "three"};
//		
//		for ( int i=0; i<numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}

	}

}
