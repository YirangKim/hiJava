package ch11;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest2 {

	public static void main(String[] args) {
		
		ArrayList<String> players = null; //<String> 제네릭, Array에
		players = new ArrayList<String>(); // 기본 생성자
		
		// 요소 인스턴스 저장
		// ArrayList
		players.add("손흥민");
		players.add("박지성");
		players.add("안정환");
		players.add("차범근");
		players.add(players.size(), "차두리");
		
		System.out.println("players List :");
		for(int i=0; i<players.size(); i++) {
			System.out.println("index"+ i + "위치 " + players.get(i));
		}
		System.out.println("================================================");
		
		// 요소의 수정
		// index2 위치의 요소를 새로운 인스턴스로 변경
		players.set(2, "이강인"); 

		displayList(players); // 안정환 -> 이강인
		System.out.println("================================================");
		// 요소삭제
		// index번호를 이용한 삭제
		// 마지막 요소 삭제
		players.remove(players.size() -1);
		System.out.println("마지막 요소 삭제");
		displayList(players); //차두리 삭제
		System.out.println("================================================");
		
		// 마지막 요소 삭제
		players.remove(2);
		System.out.println("index2 요소 삭제");
		System.out.println("현재 index2 요소 :" + players.get(2));
		System.out.println("-> 요소가 삭제되고 큰 index의 값이 지워진 index로 시프트");
		System.out.println("================================================");
		
		//요소 데이터를 이용한 삭제
		players.remove("차범근");
		System.out.println("차범근 문자열로 삭제");
		
		displayList(players);
		System.out.println("================================================");
		
		players.clear();
		System.out.println("모든 요소 삭제");
		System.out.println("모든 요소의 개수는: " + players.size());
	}

	// for반복문을 이용한 일괄처리 메소드
	static <E> void displayList(ArrayList<E> list) { // 사용자가 기능을 할 수 있는 메소드를 만듬
		// ArrayList<E> 타입의 매개변수 선언
		for ( E player : list ) { //향상된 기능의 for문 : 배열이용 list 배열만큼 출력 
			// 1) 초기화, 2) 조건, 3)내용 4)증감연산자
			System.out.println(player);
		}
	}
}
