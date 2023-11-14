package chapter01;

public class AddMethod {

	public static void main(String[] args) {

		// long 변수, add함수 
		long result = add(100, 200);
		System.out.println(result); // return, 300
		//addPrint 함수
		addPrint(10, 11);
	}
	
	// n1, n2 매개변수, 외부에서 값을 인계 받으려고 
	// 정수니까 정수로 long
	// n1 100 , n2 200 
	// void 없음
	public static long add(long n1, long n2) {
		long result = n1 + n2;
		return result;
	}
	
	//메소드 이름
	public static void addPrint (long n1, long n2) {
		long result = n1 + n2;
		System.out.println(result); //21
	}

}
