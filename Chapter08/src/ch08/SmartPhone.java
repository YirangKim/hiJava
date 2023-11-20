package ch08;

public class SmartPhone extends Phone {
	
	String model;
	
	public SmartPhone( String phoneNumber, String model) { //데이터 입력
		super(phoneNumber); //부모 클래스 Phone
		this.model = model;
	}
	
	void game() {
		System.out.println(model + "게임을 합니다");
	}
	
	// 추상메소드를 재 구성(오버라이딩)
	@Override
	void turnOn() {
		System.out.println( model + "모델에 맞게 전원을 켰습니다");
	}

}
