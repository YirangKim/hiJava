package ch05.TestSample;

public class MyClass {

	int var;
			
	public static void main(String[] args) {
		
	     //객체 생성, 초기화
		 MyClass my = new MyClass();
		 my.var = 1000;
		 System.out.println("var=" + my.var);
	}

//	public class Test { // Test사용되지 않음
//	
//	 public static void main(String[] args) {
//		
//		 MyClass my;
//		 my.var = 1000;
//		 System.out.println();
//	}
//
//	}
}
