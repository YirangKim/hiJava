package ch05;

public class TestMain {

	public static void main(String[] args) {
		
		// int a, b;
		Test t = new Test(10, 20);
		
//		a = t.getA();
//		b = t.getB();
//		System.out.println( a + b);
		
//		int sum = t.getA + t.getB;
			
		System.out.println(t.getA()); //t 변수에 저장되는 데이터는 
		// 클래스가 저장되어 있는 메모리 주소
		System.out.println(t.getB());
		System.out.println("a+b =" + (t.getA()+t.getB()) );
	}  

}
