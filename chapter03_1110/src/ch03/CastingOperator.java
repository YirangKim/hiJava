package ch03;

public class CastingOperator {

	public static void main(String[] args) {
		
//		byte num1 = 10;
//		byte num2 = 20;
		
		
		byte num1 = 126;
		byte num2 = 20;
		
		int num3 = (num1 + num2);
		// byte num3 = (num1 + num2);
		// 오류 발생 이유 byte형에 두변수 합이 자동으로 타입 변환으로 int로 변환
		//그래서 num3 자료형과 맞지 않음
		
	    System.out.println(num3);
		
		byte num4 = (byte) (num1 + num2);

		System.out.println(num4);
	}

}



