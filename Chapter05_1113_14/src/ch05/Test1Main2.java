package ch05;

public class Test1Main2 {
	
	public static void main(String[] args) {
					
		// a변수에 정수 입력
		// default생성자 없어지면 오류
		// 매개값 넣어줘야함 
		Test1 t1 = new Test1(10);
		System.out.println("t1 a= " + t1.a);
		
		// a, b 변수에 입력
		Test1 t2 = new Test1(15, 20);
		System.out.println("t2 a= " + t2.a + " b= " + t2.b);
		
		//name 변수 데이터를 출력
		Test1.name = "안녕";
		System.out.println(Test1.name);
		 
		System.out.println(t2.getA());
		System.out.println(t2.getB());
		// a+b 출력
		System.out.println("t2 a+b= " + (t2.getA()+t2.getB()));
  }

}



