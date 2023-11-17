package ch07;

public class InheritanceTest4 {

	public static void main(String[] args) {
		
		// Todo 객체생성을 한다. 인스턴스 변수는 sp는 사용합니다.
		SmartPhone sp = new SmartPhone("2222-2222","Samsung",2);

		sp.game();
		
		//sp.call(); // 부모클래스 메소드 실행 
		//sp.game(); // 자식클래스 메소드 실행
	}

}

//SmartPhone smartPhone = new SmartPhone("010-0000-0000","IOS");
//
//SmartPhone.call();
//SmartPhone.game();