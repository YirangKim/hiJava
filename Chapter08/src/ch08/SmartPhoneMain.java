package ch08;

public class SmartPhoneMain {
	
	public static void main(String[] args) {
		
		// Phone phone = new Phone(""); // 인스턴스 생성 불가
		// 부모, 자식 상속관계 있으면 생성은 부모
		
		// 다형성
		// Phone smartPhone 부모, new SmartPhone 자식 : 다형성
		Phone_p307 smartPhone = new SmartPhone_p308("010-0000-0000", "IOS");
		smartPhone.turnOn();
		
		Phone_p307 smartPhone1 = new SmartPhone_p308("010-0000-0000", "IOS");
		smartPhone1.turnOn();
		
	}

}
