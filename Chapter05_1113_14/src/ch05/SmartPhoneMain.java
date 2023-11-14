package ch05;

public class SmartPhoneMain {

	public static void main(String[] args) {
		
		//sp가 저장하는 데이터는 SmartPhone class 가 저장된 메모리가 저장
		SmartPhone sp = new SmartPhone(); // 객체생성
		SmartPhone sp1 = new SmartPhone(); //변수 
		
		System.out.println(">color :" + sp.color);
		System.out.println(">size :" + sp.size);
		System.out.println(">volume :" + sp.volume);
		sp.call();
		sp.volumeUp();
		System.out.println(sp.volume);
		sp.volumeDown();
		System.out.println(sp.volume);
		System.out.println(">color :" + sp1.color);
		System.out.println(">size :" + sp1.size);
		System.out.println(">volume :" + sp1.volume);
	}

}
