package ch04;

public class IfelseIfTest2 {

	public static void main(String[] args) {

		int number = -13;
		if ( number > 0 ) {
			//조건1 참일 때 실행
			System.out.println("양수");
		} else if( number < 0) {
			//조건 1 거짓, 조건2 참일 때 실행
			System.out.println("음수");
		} else {
			// 조건1, 2 모두 거짓일 때 실행
			System.out.println("0");
		}

	}

}
