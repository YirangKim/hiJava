package ch06;

public class ArrayTest9 {

	public static void main(String[] args) {
		
		//생성자
		Member[] members = new Member[5]; //배열 선언 및 객체 생성
		
		members[0] = new Member(1, "cool", "시원한"); //배열 변수에 클래스 객체생성 및 생성자의 매개변수 이용하여 
		// 필드에 데이터 입력
		members[1] = new Member(2, "hot", "뜨거운");
		members[2] = new Member(3, "son", "손흥민");
		members[3] = new Member(4, "park", "박지성");
		members[4] = new Member(5, "cha", "차두리");
		
		for(int i=0; i<members.length; i++) { // 출력은 서식문자를 이용하여 각 필두의 데이터를 출력
			System.out.printf("%d번 회원의 아이디는 %s이고, 이름은 %s입니다. \n", //필드 데이터 3개를 동시에 출력하기 위해 printf()메소드 사용
					members[i].membersNo, //
					members[i].memberId,
					members[i].memberName				
					);
			
			}
		
		} 
		
	}

