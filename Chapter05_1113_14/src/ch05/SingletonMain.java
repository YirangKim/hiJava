package ch05;

public class SingletonMain {

	public static void main(String[] args) {
		
		// private Singleton() {} 접근 안됨
//		 Singleton s = new Singleton();
//		 Singleton.getInstance(s);		
		
		System.out.println(Singleton.getInstance());
	}

}
