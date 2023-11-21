package ch08;

// abstract 추상클래스
public abstract class Phone_p307 {
	
	String phoneNumber; //필드
	
	public Phone_p307(String phoneNumber) { //생성자
		this.phoneNumber = phoneNumber;
	}
	
	
	void call() { // void 반환값 없음, 
		System.out.println(phoneNumber + "에서 전화를 걸어 통화를" + 
							"합니다."); 
	}
	
	// 추상메소드 정의
	abstract void turnOn(); //스마트폰 모델에 따라 전원을 키는 기능
	
}
