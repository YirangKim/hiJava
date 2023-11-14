package ch04;

//p169 3번

public class Test1 {

	public static void main(String[] args) {
		int x = 1;
		while ( x++ < 3); // x= 1 2 3 , X++ 후위연산자  
		System.out.println(x); // x= 2 3 4
	}
}
