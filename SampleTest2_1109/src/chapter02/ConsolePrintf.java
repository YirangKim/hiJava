package chapter02;

public class ConsolePrintf {

	public static void main(String[] args) {
		
		// %s 문자열
		System.out.printf("안녕하세요. 저는 %s입니다. \n","JAVA");
		// %d 정수 
		// 정수는 따옴표 없음
		System.out.printf("저는 %d살 입니다. \n", 20);
		// %d 정수, %f 소수점
		System.out.printf("정수 : %d, 실수 : %f \n", 10, 13.5);
		System.out.printf("정수 : %d, 실수 : %.1f \n", 90, 99);
		// %c 문자, %s 문자열
		// '문자(하나)', "문자열(여러개)"
		System.out.printf("문자 : %c, 문자열 : %s \n", 'Z', "king");

	}

}
