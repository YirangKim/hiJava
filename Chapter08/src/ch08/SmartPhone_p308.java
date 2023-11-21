package ch08;

// 추상클래스 상속 Phone_p307
public class SmartPhone_p308 extends Phone_p307 {
	
	String model;
	
	public SmartPhone_p308( String phoneNumber, String model) { //데이터 입력
		super(phoneNumber); //부모 클래스 생성자 호출
		this.model = model;
	}
	
	void game() {
		System.out.println(model + "게임을 합니다");
	}
	
	// 추상메소드를 재구성(오버라이딩)
	@Override
	void turnOn() {
		System.out.println( model + "모델에 맞게 전원을 켰습니다");
	}

}
