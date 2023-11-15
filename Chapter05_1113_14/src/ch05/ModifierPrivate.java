package ch05;

public class ModifierPrivate {
	
	// private 접근 제어자
	// private 클래스 내부에서만 가능
	private String name="홍길동"; // 필드 군 //초기값 null
	private int age=100; // 초기값 0
	
	// void : 반환값
	// 반환값을 반화할 필요가 없다
	void tell(){ //default 제어자 사용, 메소드(void)
		System.out.println("안녕하세요." + age + "살" + name + "입니다");
	}

}
