package ch08;

// 8.3 내부클래스 

//외부 클래스 OuterClass 
public class OuterClass {
	
	private String name;
	private int num;
	
	// 같은 이름쓰면 생성자
	// 매개변수와 동일하게 사용하기 위해 = 같은 데이터이기 때문에
	OuterClass(String name) {
		this.name = name; // this를 사용하기 이유는 필드에서 사용하는 변수 이름과
		// 생성자에서 사용하는 매개 변수이름을 같은 이름으로 사용 : 같은 데이터 
		num = 0; //초기화, 값을 저장하기 위해
	}
	
	// 실행 저장
	public void introduce() {
		num++;
		System.out.println(name + "OuterClass" + num);
	}
	
	// 내부 클래스 InnerClass
	class InnerClass{
		InnerClass() {
			introduce(); // 내부클래스는 외부클래스 멤버 사용 가능
		}
	}
	
	public static void main(String[] args) {
		
		// new 객체 생성
		OuterClass out1 = new OuterClass("King");
		OuterClass out2 = new OuterClass("SCOTT");
		out1.introduce(); 
		out2.introduce(); 
	
		OuterClass.InnerClass inn1 = out1.new InnerClass(); // 객채생성하면서 실행
		// out1.new InnerClass();
		// Outer안에 InnerClass 객체 생성 out2.new InnerClass();
		OuterClass.InnerClass inn2 = out2.new InnerClass();
		OuterClass.InnerClass inn3 = out1.new InnerClass();
		OuterClass.InnerClass inn4 = out1.new InnerClass();
		OuterClass.InnerClass inn5 = out2.new InnerClass();
		
	}

}
