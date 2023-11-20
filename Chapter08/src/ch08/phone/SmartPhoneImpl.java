package ch08.phone;

//p.316

public class SmartPhoneImpl extends Computer implements Phone {
	
	boolean power; //true, false
	

	@Override //재정의
	public void call() {
		String number1 = String.valueOf(PHONE_NUM_1);
		String number2 = String.valueOf(PHONE_NUM_1);
		String number3 = String.valueOf(PHONE_NUM_9);

		System.out.println(number1 + number2 + number3);

	}
	
	// turnOn = true 
	// power = 1 true  turnOn
	// power 1x = 0
	// power = false(0) 
	// 재정의 안하면 추상클래스
	
	// boolean 초기값이 false
	

	@Override
	public void turnOn() {
		if ( !power ) { // 1=부정 이면 동작X
			power = true; // power 데이터값이 1이면 실행 안됨 // true=1 , flase=0
		}
	}

	@Override
	public void turnOff() {
		if ( power ) {
			power = false; // 1이면 동작한다.
		}
	}

}
