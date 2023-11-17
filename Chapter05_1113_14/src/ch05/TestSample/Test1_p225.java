package ch05.TestSample;

//p225 문제1

public class Test1_p225 {
	
//	private static int x = 7;  // 클래스 내부에서만
	
	// void=default 
	void method() { // void 반환
		//private static int x = 7; //private, static 에러 
		int x = 7;
		System.out.println("x=" + x ); // x =7
	}
	
	//static 
	public static void main ( String[] args ) {
		Test1_p225 t = new Test1_p225();
		t.method(); // x=7
	}

}