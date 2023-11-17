package ch07;

public class SmartPhoneImpl2 extends Phone {
	
	String model;
	
	public SmartPhoneImpl2 (String phoneNumber, String modal) {
		super(phoneNumber);
		this.model = model;
	}
	
	@Override  //메소드 오버라이딩
	void call() {
		super.call();
		System.out.println("이어팟을 이용해서 통화를 합니다");
	}
	
	void palyMusic() { // SmartPhoneImpl2 
		System.out.println("다이너마이트가 플레이 됩니다");
	}

}
