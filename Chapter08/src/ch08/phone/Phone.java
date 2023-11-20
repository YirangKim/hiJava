package ch08.phone;

public interface Phone { //Phone 인터페이스 이름
	
	int PHONE_NUM_1 = 1;
	int PHONE_NUM_2 = 2;
	int PHONE_NUM_3 = 3;
	int PHONE_NUM_4 = 4;
	int PHONE_NUM_5 = 5;
	int PHONE_NUM_6 = 6;
	int PHONE_NUM_7 = 7;
	int PHONE_NUM_8 = 8;
	int PHONE_NUM_9 = 9;
	int PHONE_NUM_0 = 0;
	
//	int A = 1; //A 상수,대문자  
	
	void call(); // 추상메소드는 public abstract생략 가능
	
	void turnOn(); // 추상메소드는 public abstract생략 가능
	void turnOff(); // 추상메소드는 public abstract생략 가능

}
