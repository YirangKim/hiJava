package ch06;

public class ArrayTest8 {

	public static void main(String[] args) {
	
		int[][] score2 = {
							{1,2},
							{3,4}
						 };
		
		for( int[] y : score2 ) { //행에서 사용한 변수a를 
			// 열의 변수에 대입해야 한다
			for( int a : y ) { //행에서 열의 데이터가 있으면 출력
				//a변수 데이터 저장한다
				System.out.println( a );
			}
			
			System.out.println();
		} 

	}

}
