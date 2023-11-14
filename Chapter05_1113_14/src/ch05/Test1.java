package ch05;

public class Test1 {

	//static 객체 생성X
	static String name = "neme";
	int a;
	int b;
	
	// Test() {}
	
	//생성자, 매개값
	Test1(int a){
		// 연결
		this.a = a;
	}
	
	
	Test1(int a, int b){
		// 연결
		this.a = a;
		this.b = b;
	}
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
//	name 빼도됨
//	public static String getName() {
//		return name;
//	}
//	public static void setName(String name) {
//		Test1.name = name;
//	}
	
}
