package ch08.phone;

public class SmartPhone implements Phone {
	
	boolean power;

	@Override
	public void call() {
		String number1 = String.valueOf(PHONE_NUM_1);
		String number2 = String.valueOf(PHONE_NUM_1);
		String number3 = String.valueOf(PHONE_NUM_9);
		
		System.out.println(number1 + number2 + number3);

	}

	@Override
	public void turnOn() {
		if ( !power ) { // 1=부정 이면 동작X
			power = true; //power 데이터값이 1이면 실행 안됨
		} 
	}

	@Override
	public void turnOff() {
		if ( power ) {
			power = false; // 1이면 동작한다.
		}

	}

}
