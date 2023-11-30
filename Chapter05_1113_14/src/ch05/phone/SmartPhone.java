package ch05.phone;

public class SmartPhone {
	
	//String 참조형, float/int 자료형
	String color;
	float size;
	int volume;
	
	// 생성자 
	// public(공유) 빼면 default
	// 접근제어자, 참조형, 클래스이름
	public SmartPhone(String color, float size, int volume) {
		this.color = color;
		this.size = size;
		this.volume = volume;		
	}
	
	void call() {
		System.out.println("젼화걸기");
	}

	void volumeUp () {
		volume += 1;
	}
	
	void voluneDown() {
		volume += 1;
	}
	
	public static void main(String[] args) {
		
		// sp = SmartPhone
		SmartPhone sp = new SmartPhone("RED", 10.5F, 0);
		System.out.println(">color : " + sp.color);
		System.out.println(">size : " + sp.size);
		System.out.println(">volume : " + sp.volume);
		sp.call();
	}
}
