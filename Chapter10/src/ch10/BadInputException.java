package ch10;

public class BadInputException extends Exception {
	
	// 사용자 정의 예외클레스는 Exception클래스를 상속해서 정의
	// 생성자
	BadInputException() {
		super("사용자의 입력 값이 올바르지 않습니다");
	}
}
