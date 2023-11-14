package ch05;

// 인스턴스 변수 사용 예제
// static 없으니 메모리 저장X
// 선언만 한 것
public class InstanceVariable {
	
	String name = "KINGS"; //인스턴스 변수 name 선언
	int age = 12;
	
	void tellName() {
		System.out.println("나의 이름은" + name + "입니다.");
	}
	
	void tellAge() {
		System.out.println("나는" + age + "살 입니다.");
	}
	
	// static쓰는 이유 : 메모리에 저장하기 위해
	// 내가 원하는것만 저장할 수 있음
	public static void main(String[] agrs) {
		
		InstanceVariable variable = new InstanceVariable();
		variable.tellName(); //인스턴스 메소드 호출
		variable.tellAge(); //인스턴스 메소드 호출
		
	}

}
