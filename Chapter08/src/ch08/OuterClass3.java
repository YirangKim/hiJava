package ch08;

//import ch08.OuterClass2.BasicClass;

public class OuterClass3 {

	 private String name;
	 
	 OuterClass3(String name){
		 this.name = name;
	 }
	 
	 // BasicClass 반환 타입 
	 public BasicClass createLocalClassInstance(final int age) {
		 
		 class LocalClass extends BasicClass{
			 
			@Override
            public void tell() {
                System.out.println("안녕하세요 " + name + "입니다. 나이는 " + age + "세 입니다.");
            }
		 }
		 
	 // return 주소값 리턴 
	return new LocalClass();
	 
	 }
	 
	// main 실행 
	public static void main(String[] args) {
		
		OuterClass3 out = new OuterClass3("KING"); //(String name)
		BasicClass localInst1 = out.createLocalClassInstance(12);  //age
		localInst1.tell();

	}
	
	//추상 메소드
	abstract class BasicClass{
		public abstract void tell();
	}

}
