package ch04;

public class SmartPhone extends Phone {
	
	//Todo 기본 생성자 생성
	SmartPhone() {};
	
	SmartPhone(String color){
		// Todo 생성자 이용하여 데이터 입력
		super(color);
	}
	
	SmartPhone(String color, String model){
		// Todo 부모 클래스의 변수를 사용하여 데이터 입력
		super(color, model);
	}
	
	SmartPhone(String color, String model, int price){
		// Todo 부모 클래스의 변수를 사용하여 데이터 입력
		super(color, model, price);
	}
}
