package ch09;

public class ObjcetToString {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		Car c2 = new Car();
		
		System.out.println(c1);
		System.out.println(c2);

	}
}

class Car{
	
	@Override //재정의
	public String toString() {
		return "Car Class 기반의 인스턴스 입니다";
	}
}
