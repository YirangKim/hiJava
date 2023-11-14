package chapter02;

public class Test1 {

	public static void main(String[] args) {
		byte a = 64;
		byte b = 64;
		// a + b int 처리 int 정수 숫자 
		// int 안되게  (byte)  byte로 형변환
		//byte result = (byte) (a + b); 강제 타입변환 
		int result = a + b;
		System.out.println("result = " + result);

	}

}
