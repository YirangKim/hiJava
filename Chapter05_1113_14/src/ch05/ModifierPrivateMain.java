package ch05;

public class ModifierPrivateMain {

	public static void main(String[] args) {
		
		ModifierPrivate mp = new ModifierPrivate();
		// void tell(){}
		
		// mp.name; // 접근 불가. 접근제어자 private접근 거부됨
		// mp 주소 : ModifierPrivate();
		mp.tell(); // 접근 가능. 접근제어자 private private 접근 가능
		

	}

}
