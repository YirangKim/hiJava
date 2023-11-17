package ch06;

public class ArrayTest_String {

	public static void main(String[] args) {
		String[][] score = {
				 {"이순신","강감찬"},
				 {"홍길동","강감찬"},
				 {"권율","강감찬"},
				 {"김유신","강감찬"},
			   };

		//String 타입
		for ( String[] y : score ) {
		for ( String a : y) {
			System.out.println(a);
		} 
		System.out.println();
		} 

	}

}
