package ch05.phone;

public class SmartPhone3 {
	
	// 전역 변수
	String color;
	float size;
	int volume;
	
	// 매개 변수
	// 변수 위치가 다르니 중복되도 괜찮다, 외부 출동 없음
	public SmartPhone3(String color, float size, int volume) {
		this.color = color;
		this.size = size;
		this.volume = volume;
	}
	
	public SmartPhone3(String color, float size) {
		this.color = color;
		this.size = size;
		//매개 변수 없어도 직접 값 지정하면 됨
		this.volume = 0;
	}
	
	public SmartPhone3(String color) {
		this(color, 5.7F, 0);
//		this.color = color;
//		//매개 변수 없어도 직접 값 지정하면 됨
//		this.size = 5.7F;
//		this.volume = 0;
	}
	
	
	public SmartPhone3(float size) {
		this("Black", size, 0);
	}
	
	void call() {
		System.out.println("전화걸기");
	}
	
	void volumeUp() {
		volume += 1;
	}
	
	void volumeDown() {
		volume -= 1;
	}
	
	void printSpec() {
		System.out.println("> 스마트폰의 색상 : " + color );
		System.out.println("> 스마트폰의 사이즈 : " + size );
		System.out.println("> 스마트폰의 볼륨 크기 : " + volume );
	}
	
	
	public static void main(String[] args){
		
		SmartPhone3 sp = new SmartPhone3("RED", 10.5F, 0);
		
		sp.printSpec();
		System.out.println();
		
		SmartPhone3 sp1 = new SmartPhone3("GOLD", 4.1F);
		sp1.printSpec();
		System.out.println();
		
		SmartPhone3 sp2 = new SmartPhone3("BLUE");
		sp2.printSpec();
		System.out.println();
		
		SmartPhone3 sp3 = new SmartPhone3(5.0F);
		sp3.printSpec();
			
		
	}
}
