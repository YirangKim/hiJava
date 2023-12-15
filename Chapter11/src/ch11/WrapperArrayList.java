package ch11;

import java.util.ArrayList;

public class WrapperArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = null;
		numbers = new ArrayList<Integer>(); //Wrapper 클래스
		
		//요소 인스턴스 저장
		numbers.add(10); // Wrapper 인스턴스 변수에 기본타입에 정수, 기본타입의 정수 데이터를 boxing
		numbers.add(30);
		numbers.add(40);
		numbers.add(20);
		numbers.add(50);
		
		System.out.println("displayList :");
		displayList(numbers); //boxing되어있는 데이터를 다시 unboxing해서 출력한다
   
		System.out.println("============================");

	}
	
	// for반복문을 이용한 일괄처리 메소드: 제네릭 메소드
	static <E> void displayList(ArrayList<E> list) {
		for ( E player : list) {
			System.out.println(player);
		}
	}
}
