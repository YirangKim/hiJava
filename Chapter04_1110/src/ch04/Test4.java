package ch04;

public class Test4 {

	public static void main(String[] args) {
		int i = 1, j = 10;
		do { //do 먼저 실행
			if ( i > j ) break; // i가 j보다 크면 빠져나감
			j--; // j = 9 8 7 6 5
		} while ( ++i < 5); // i = 2 3 4 , 5보다 작으면 동작, 6은 멈춤 
		System.out.println("i=" + i + ", j= " + j); // j=6, i=4
	}
}
