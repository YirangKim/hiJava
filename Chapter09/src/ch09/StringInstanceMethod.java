package ch09;

public class StringInstanceMethod {

	public static void main(String[] args) {
		
		String str = "Hello~";
		
		//charAt(int index) 문자 위치 지정
		System.out.println(str.charAt(0)); 
		System.out.println(str.charAt(5));
		
		// i = 0 1 2 3 4 5
		for(int i=0; i < str.length(); i++) { // length 6  i = 0 1 2 3 4 5
			System.out.println(str.charAt(i) + " "); //  H e l l o ~
		}
		System.out.println();
		
		// int compareTo(String anotherString)
		// 원본 문자열 - 비교 문자열 계산
		// 문자열 같으면 0 반환
		System.out.println(str.compareTo("Hello~")); // 0
		System.out.println(str.compareTo("Hello~ JAVA~!!")); // -8
		System.out.println(str.compareTo("Hello")); // 1
		
		// concat
		// 원본 문자열에 매게변수 문자열 뒤에 붙이기
		System.out.println(str.concat("JAVA!")); //  Hello~JAVA! 
		
		// str.contains 
		// 원본 문자열에 매게변수 문자열이 포함하고 있으면 true, 아니면 false
		System.out.println(str.contains("llo")); // true
		
		// endsWith
		// 원본 문자열 끝 접미어와, 매개변수 문자열 해당 문자열로 끝나면 true, 아니면 false
		System.out.println(str.endsWith("o~")); // true
		
		// equals
		System.out.println(str.equals("Hello~")); // true
		System.out.println(str.equals("java")); //false
		
		// indexof 인덱스 위치 값 반환
		System.out.println(str.indexOf('H')); //0
		System.out.println(str.indexOf('~')); //6
		
		// idexof(String srt)
		System.out.println(str.indexOf("lo")); // ???
		
		// isEmpty 공백 체크 
		System.out.println(str.isEmpty()); //false
		System.out.println("".isEmpty()); // true
		
		System.out.println(str.length()); // 6
		System.out.println("JAVA".length()); //4
		
		System.out.println(str.replace('~', '!')); //Hello!
		
		System.out.println(str.replace("Hello", "JAVA")); //JAVA~
		
		//startsWith 원본문자열 접두어 시작 확인
		System.out.println(str.startsWith("HE")); //ture
		System.out.println(str.startsWith("JAVA")); // false
		
		// substring 매개변수로 받은 인덱스 위치 
		System.out.println(str.substring(2));//llo~ 값1개 있을 때는 그 숫자부터 끝까지
		System.out.println(str.substring(2, 4)); // 시작부터, end 숫자 전까지
		// Hello~
		// 012345
		
		char[] chars = str.toCharArray(); // 0 1 2 3 4 5
		System.out.println(chars[1]); // e
		
		// toString
		// 문자열객체가 가지고 있는 문자열 반환
		// ????? object클래스 toString() 메소드를 오버라이딩 메소드
		System.out.println(str.toString());
		
		// 공백제거 trim
		str = "   Hello Java   ";
		System.out.println(str); //    Hello Java   //앞뒤 공백은 있고
		System.out.println(str.trim()); //Hello Java //앞뒤 공백은 없어지고, 중간공백은 있고 
		
	}

}
