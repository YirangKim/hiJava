package ch09;

public class ObjectEquals {
	
	public static void main(String[] args) {
		
		Car c1 = new Car(); // 객체 생성 한다는 것은 실행
		Car c2 = new Car();
		
		System.out.println("두 객체는 equals() 비교 : " + c1.equals(c2));
		
		c1 = c2; //c2의 주소를 c1변수에 저장한다
		
		System.out.println("두 참조변수의 참조 값을 동이하게 변경");
		System.out.println("두 객체를 equals() 비교 :" + c1.equals(c2));
		// true 참이 된 이유는 c1 = c2가 있어서
		// c1 == c1를 사용하면 된다
	}

}
  