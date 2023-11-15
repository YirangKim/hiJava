package ch05;

public class ModifierDefaultMain {

	public static void main(String[] args) {

		// Default 접근제어자에 접근하려면 인스턴스 생성
		// ModifierDefault 형식 맞추기 : 클래스에 주소를 넣을꺼야
		ModifierDefault mp = new ModifierDefault(); 
				
		// mp 클래스 주소 출력
		System.out.println(mp);
		
		mp.name = "손흥민";
		mp.age = 28;
		mp.tell(); //void tell() {}
		
	}

}
