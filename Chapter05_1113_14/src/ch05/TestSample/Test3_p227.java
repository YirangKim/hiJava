package ch05.TestSample;

// p227 5번문제

public class Test3_p227 {

	private static int x;  // private 클래스 내부에서만
	// static : 메모리에 저장하기 위해
	
	public static void main(String[] args) {
		method( x );
//		System.out.println("x=" + x); // x = 0 ???
	}

	public static void method ( int x ) {
		x++; // x = 1
	} 
}
