package ch04;

//p170 6번
public class Test4 {

	public static void main(String[] args) {
		int i = 1, j = 10;
		do { //do 먼저 실행
			if ( i > j ) break; // i=1, j=10 // i가 j보다 크면 빠져나감, 조건 충족안되면 j--, while 반복 
			j--; // j-- = 9 8 7 6 5 후위연산자
		} while ( ++i < 5); // i = 2 3 4, 5보다 작으면 동작 멈춤 => i = 5 
		System.out.println("i=" + i + ", j= " + j); // j=6, i=5
	}
}
