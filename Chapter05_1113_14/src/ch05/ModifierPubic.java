package ch05;

public class ModifierPubic {
	
	public String name;
	public int age;
	
	public void tell() { // void 반환 하지 말아라 
		System.out.println("안녕하세요." + age + "살" + name + "입니다." );
	}
	
//	public String tell() { 
//		return name;
//	}

}
