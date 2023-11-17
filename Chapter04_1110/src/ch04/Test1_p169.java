package ch04;

//p169 3번

public class Test1_p169 {

	public static void main(String[] args) {

			int x = 1;
			while ( x++ < 3) { // while 거짓 될때까지 반복
			// x= 1 2  , x++ 후위연산자 : x = x + 1  
		System.out.println(x);} // x= 2 3 
	}
}
