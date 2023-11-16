package ch04;

//p170 4번

public class Test2 {

	public static void main(String[] args) {
		int i = 0, j = 0;
		for ( i = 0; i < 5; i++) { // i = 0 1 2 3 4
			for ( j = 0; j < 4; j++ ) { // j = 0 1 2 3
				if( i ==2 && j == 1 ) break; //i = 2, j = 1 중단, j = 1
				if( i ==3 && j == 2) continue; // i = 3 4, j = 2 3 탈출 
			}
		}
		System.out.println("i =" + i + ", j =" + j); // i=4, j = 2
	}
}
