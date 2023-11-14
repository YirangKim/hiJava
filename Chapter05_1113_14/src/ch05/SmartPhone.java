package ch05;

public class SmartPhone {
	
	String color = "white"; //필드
	float size = 5.7F; //필드
	int volume = 0; //필드
	
	// SmartPhone(){ }; // 생성자는 자동으로 만들어진다 => default 생성자라고한다 
			
	void call() {
		System.out.println("전화걸기");
	}
	
	void volumeUp() {
		volume += 1;
	}
	
	void volumeDown() {
		volume -= 1;
	}
		
}
