package ch10;

public class ExceptionClassTest1 {

	public static void main(String[] args) {
		
		try {
			
			Class.forName("Example, 예외발생"); // 예외발생
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}

