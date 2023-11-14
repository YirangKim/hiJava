package ch04;

public class Test1 {

	public static void main(String[] args) {
		int x = 1;
		while ( x++ < 3); // x= 1 2 3  // 거짓일때 종료
		System.out.println(x); // x=3
	}
}
