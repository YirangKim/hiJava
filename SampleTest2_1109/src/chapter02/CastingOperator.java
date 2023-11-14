package chapter02;

public class CastingOperator {

	public static void main(String[] args) {
		
		// char 자료형 길이 2Byte
		// 정수 int로 바뀌면 97
		char c1 = 'a';
		int n1 = 1; //int 자료형은 4Byte
		
		System.out.println(c1 + n1);
		
		// int -> float 변환
		int n2 =10;
		float n3 = 10.0f;
		
		System.out.println(n2 + n3);

	}

}
