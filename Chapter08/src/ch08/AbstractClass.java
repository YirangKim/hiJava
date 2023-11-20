package ch08;

// 8.1.2 추상 클래스 생성 p305

public abstract class AbstractClass {
	
	int num;
	String name;
	
	abstract void abstratMethod(); //추상 메소드, 중괄호가 없다
	// 추상 메소드를 사용하는 목적은 재정의해서 사용하기 위함
	
	void instanceMethod() {
		abstratMethod();
	}
	
	void printData() {
		System.out.println(name);
	}

}
