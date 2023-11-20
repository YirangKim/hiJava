package ch08.phone;

public class SmartPhoneMain3 {

	public static void main(String[] args) {
		
		SmartPhoneImpl4 phone = new SmartPhoneImpl4();
		
		SmartDevice s = phone;
	
		s.turnOn();
		
		Phone p = phone; 
		p.call();
		
		Application a = phone;
		a.appRun();

		// 상속 다형성
		// SmartPhoneImpl4 <  SmartDevice < Phone, Application
		// SmartPhoneImpl4 < SmartDevice => SmartPhoneImpl4 부모는 SmartDevice
		// SmartDevice <  Phone, Application => 인터페이스 다중화 
		
		// 하위에서 상위꺼 쓸수있고
		// 상위에서 하위꺼 
	}

}
