package ch08;

public class OuterClass2 {

	 private String name;
	 
	 OuterClass2(String name){
		 this.name = name;
	 }
	 
	 // BasicClass 반환 타입 
	 public BasicClass createLocalClassInstance() {
		 
		 // LocalClass
		 // BasicClass 클래스를 상속하는 구조로 해서 반환 타입을  BasicClass 타입으로 처리 
		 // BasicClass 부모
		 class LocalClass extends BasicClass{
			 
			 // BasicClass 클래스의 tell() 메소드 오버라이딩
			 // 재정의 
			 public void tell() {
				 System.out.println("안녕하세요 " + name + " 입니다.");
			 }
		 }
	 // return 주소값 리턴 
	return new LocalClass();
	 
	 }
	 
	// main 실행 
	public static void main(String[] args) {
		
		OuterClass2 out = new OuterClass2("KING"); //(String name)
		// 외부클래스 인스턴스 이용해서만 내부클래스 인스턴스 생성
		// createLocalClassInstance 외부클래스
		BasicClass localInst1 = out.createLocalClassInstance();  
		localInst1.tell();

	}
	
	//추상 메소드
	abstract class BasicClass{
		public abstract void tell();
	}

}
