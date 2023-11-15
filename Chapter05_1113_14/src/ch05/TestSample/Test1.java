package ch05.TestSample;

public class Test1 {
	
	private static int x = 7;  // 클래스 내부에서만
	
	void method() { // void 반환
		//private static int x = 7; // 클래스 내부에서만
		System.out.println("x=" + x ); // x =7
	}
	
	//static 
	public static void main ( String[] args ) {
		Test1 t = new Test1();
		t.method(); // x=7
	}

}