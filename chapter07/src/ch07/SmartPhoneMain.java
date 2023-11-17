package ch07;

public class SmartPhoneMain {

	public static void main(String[] args) {
		
		Phone phone = new SmartPhoneImpl2("010-1111-2222", "Android");
		//다형성 특징 부모 클래서의 이름을 참조타입으로 사용한다
		phone.call();
	}
}
