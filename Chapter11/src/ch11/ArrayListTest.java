package ch11;

import java.util.ArrayList;

public class ArrayListTest { //ArrayListTest 컬렉션 클래스

	public static void main(String[] args) {
		
		ArrayList<String> players = null; //players는 인스턴스 변수
		players = new ArrayList<String>();
		
		// 요소 인스턴스 저장 
		// index 값
		players.add("손흥민"); //S
		players.add(new String("박지성")); //생성자에 매개값 "박지성" 저장
		players.add(new String("차범근"));
		
		System.out.println("index-1 위치의 데이터:" +players.get(0)); //index 0 위치 요소 참조
		System.out.println("index-2 위치의 데이터:" +players.get(1));
		System.out.println("index-3 위치의 데이터:" +players.get(2));

		players.add(1, new String("안정환")); // index1 위치에 '안정환' 추가 : 인스턴스 저장
		System.out.println("index-1 위치에 새로운 데이터 입력 :");
		System.out.println("index-1 위치의 데이터:" +players.get(0));
		System.out.println("index-2 위치의 데이터:" +players.get(1)); // index가 시프트되어 박지성이 2로 변경, 삭제아님
		System.out.println("index-3 위치의 데이터:" +players.get(2));
		System.out.println("index-4 위치의 데이터:" +players.get(3));
		
		// List<E> 인스턴스가 저장하는 요소의 개수 반환
		System.out.println("지금까지의 플레이어 수는 " +players.size()+"명입니다."); //players의 요소 개수 반환
		
		// 마지막 index에 요소 저장
		players.add(players.size(), "차두리"); // size() 메소드 개수는 마지막 index값에 +1한 값이다
		System.out.println("index-4 위치의 데이터:" +players.get(4));
		
		System.out.println("모든 플레이어 수는 " +players.size()+"명입니다."); //players의 요소 개수 반환
		
		// 마지막 index는 : 요소의 개수 -1
		int lastIndex = players.size() -1; // 마지막 index값

		String lastPlayer = players.get(lastIndex);
		
		System.out.println("last-index 위치의 데이터 :" +lastPlayer);
		
		System.out.println("for 반복문을 이용해서 전체 요소를 출력합니다");
		
		for (int i=0; i<players.size(); i++) {
			System.out.println(players.get(i));
		}
		
	}

}
