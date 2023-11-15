package ch05;

public class Singleton {
	
	private int a;
	
	// 생성자 
	private Singleton() {
	}
	
	// new 객체생성
	// Singleton 참조형, class 명과 같음
	private static Singleton s = new Singleton(); // static 형식 맞춰야함
		
	// static
	// Singleton.s = null;
	
	// static 쓰는 이유
	// 외부에서 객채를 사용가능하도록 하기 위함
	public static Singleton getInstance() {
		if ( s == null) {
			s = new Singleton();
		}

	return s;
	}
}
