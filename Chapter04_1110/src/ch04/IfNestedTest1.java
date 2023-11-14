package ch04;

public class IfNestedTest1 {

	public static void main(String[] args) {

		int num = 10;
		
		if ( num > 0) {
			System.out.println("num의 양의 정수입니다");
		} else {
			if (num < 0) {
				System.out.println("num은 음의 정수입니다");
			} else {
				System.out.println("num은 0입니다");
			}
		}

	}

}
