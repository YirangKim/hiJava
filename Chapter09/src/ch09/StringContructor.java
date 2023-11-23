package ch09;

public class StringContructor {

	public static void main(String[] args) {
		
		byte[] bytes = {74, 97, 118, 97}; // 정수
		System.out.println("bytes는 " + bytes); //배열 시작 주소 
		
		String str01 = new String(bytes); // 배열 = 문자열 // byte를 String으로 아스키코드
		//배열은 매개값을 주소로 넣으면 됨
		System.out.println("str01는 " + str01); // java 출력
		// 74가 J가 된다. byte정수형으로 문자열로 변환된다
		//아스키코드 J 74, a 97, v 118, a 97
		
		
		// Java > 0, 1, 2, 3
		String str02= new String(bytes, 0, 3); // index 2에서 2자리 까지
		System.out.println(str02);
		
		//'J' 'A' 'V' 'A' 'H' 'e' 'l' 'l' 'o'
		char[] chars = {'J', 'A', 'V', 'A', ' ', 'H', 'e', 'l', 'l', 'o'};
		System.out.println(chars);
		
		String str03 = new String(chars);
		System.out.println(chars);

	}

}
