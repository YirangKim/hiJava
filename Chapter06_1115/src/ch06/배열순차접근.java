package ch06;

public class 배열순차접근 {

	public static void main(String[] args) {
		
		int[][][] score = {
				 { {1,2}, {3,4} },
				 { {5,6}, {7,8} },
				 };
		
		for( int[][] y : score ) { // 행 0 1
			for ( int[] a : y ) { // 열 a는 0면 0행 0열, 0면 0행 1열, 두번 째 0행 0열, 1면 0행 
				for ( int b : a) {
					System.out.print( b );
				}
				System.out.println();
			}
		}

	}

}
