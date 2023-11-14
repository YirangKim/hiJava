package ch05;

public class AdderMain {

	public static void main(String[] args) {
		
		//인스턴스 변수
		Adder adder = new Adder();
		
		//adder.add(10, 20);
		System.out.println(adder.add(10, 20));

		//adder.add(5, 5);
		System.out.println(adder.add(5, 5));
		
		//adder.add(10.1f, 20.2f);
		System.out.println(adder.add(10.1f, 20.2f));
		
	}

}
