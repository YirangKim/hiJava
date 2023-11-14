package ch03;

public class CharTypeOperator2 {

	public static void main(String[] args) {
		
		char c = 'A'; //유니코드 값 저장 10진수 65
		
		System.out.println( c++ ); //char 타입의 증감연삼은 char 타입 유지
		System.out.println( c-- ); 
		System.out.println( c ); 
		System.out.println( ++c ); 
		System.out.println( --c ); 

	}

}
