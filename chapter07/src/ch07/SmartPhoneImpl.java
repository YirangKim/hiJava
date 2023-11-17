package ch07;

public class SmartPhoneImpl extends Phone {
	
	String model;
	
	public SmartPhoneImpl (String phoneNumber, String model) {
		super(phoneNumber);
		this.model = model;
	}
	
	@Override
	void call() {
		super.call();
		System.out.println("이어팟을 이용해서 통화를 합니다");
	}
	
	public static void main(String[] args) {
		
		SmartPhoneImpl phone = new SmartPhoneImpl("010-9999-0000","IOS");
		phone.call(); //자식 클래스에 부모클래스 메소드 오버라이딩한 메소드호출
	}
	

}
