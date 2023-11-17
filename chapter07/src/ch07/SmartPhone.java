package ch07;

public class SmartPhone extends Phone { //처음 선언한 클래스가 자식, extends, 상속 받음
	
	String model;
	
	// 매개 변수 추가
	public SmartPhone (String phoneNumber, String model, int num) { //생성자 호출
		// 필드 변수에 데이터를 저장하는 방법은 2가지
		// 생성자의 매개변수를 이용하는 방법
		// setter 메소드를 이용하는 방법
		
		// Todo 부모클래스인 멤버인 phoneNumber와 num 데이터를 입력하도록 수정
		super(phoneNumber, num); // 클래스이름에 (괄호) : 생성자,  super.phoneNumber 아님!!! 
		// 상위클래스 생성사 호출
		this.model = model;				
	}
	
	void game() { //반환X // game 메소드
		super.call();
		System.out.println(model);
	}
	
}


//// 사용한 클래스는 부모클래스
//String model; // 상속한 부모클래스에 model까지 사용할 수 있음
//
//
//void game() { //반환X // game 메소드
//	System.out.println(model + "게임을 합니다.");
//}
