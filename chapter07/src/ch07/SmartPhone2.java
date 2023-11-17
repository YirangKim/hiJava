package ch07;

public class SmartPhone2 extends Phone {
	
	String model;
	
	void game() {
		super.call(); // 메소드 call
		System.out.println(model + "게임을 합니다.");
	}

}
