package ch11;

public class MyInterfaceImplMain {

	public static void main(String[] args) {
		MyInterfaceImpl<String, Integer> my = null; //제네릭 타입 변수 선언
		my = new MyInterfaceImpl<String, Integer>(); //제네릭 타입 인스턴스 생성
		
		System.out.println(my.method1("Ten"));
		System.out.println(my.method2(10));

	}

}
