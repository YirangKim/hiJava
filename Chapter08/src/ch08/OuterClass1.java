package ch08;

// 8.3.2 Nested 클래스 

public class OuterClass1 {

	// 매개변수가 없는 기본 생성자 //객체 생성
	// 실행 저장
	OuterClass1() {
		NestedClass nst = new NestedClass(); // 객체 생성
		nst.simpleMethod(); // 실행 
	}
	
	static class NestedClass {
		public void simpleMethod() {
			System.out.println("Nested Class Instance Method One");
		}
	}
	
	public static void main(String[] args) {
		
		// OuterClass1 타입
		OuterClass1 one = new OuterClass1(); // 객체 생성하면서
		// st.simpleMethod(); 실행
		// 매개값 -> 필드에 저장
		
		//외부클래스. 내부 클래스 형식으로 인스턴스 생성
		// 
		OuterClass1.NestedClass nst1 = new OuterClass1.NestedClass();
		
		nst1.simpleMethod();
	}

}

