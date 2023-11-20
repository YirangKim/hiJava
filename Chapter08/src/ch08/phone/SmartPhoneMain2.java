package ch08.phone;

//p.317 

public class SmartPhoneMain2 {

	public static void main(String[] args) {
		
		SmartPhoneImpl phone = new SmartPhoneImpl();
		
		phone.call(); //Phone에 있는 추상메소드를 SmartPhoneImpl에서 재정의 해서 사용
		phone.calculator(); //Computer에서 사용한 메소드

	}

}
