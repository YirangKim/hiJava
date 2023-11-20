package ch08.phone;

// 부모 인터페이스 Application, Phone
public interface SmartDevice extends Application, Phone {
	
	// 인터페이스 간에 상속을 설정함
	// 인터페이스 상속은 다중상속 가능
	// 일반 클래스에서의 상속은 하나만 가능합니다.

}
