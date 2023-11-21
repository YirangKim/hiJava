package ch09;

public class PersonEquals {

	public static void main(String[] args) {
		
		//Person 클래스의 인스턴스 생성
		Person porson1 = new Person("Lee", "20001010-1000000");
		System.out.println("porson1 " + porson1);
		Person porson2 = new Person("Lee", "20001010-1000000");
		System.out.println(" porson2 " + porson2);
		
		System.out.println("참조변수의 비교");
		System.out.println("person1 = person2 => " + (porson1 == porson2));
		// person1 = person2 => false // 주소가 달라서
		System.out.println();
		System.out.println("인스턴스의 equals() 메소드로 비교");
		
		System.out.println("person1.equals(person2) => " + porson1.equals(porson2));
//		System.out.println(porson1);
//		System.out.println(porson2);
		// true type
	}
}

	class Person {
		
		// 멤버 변수 선언
		String name;
		String juminNo;
		
		// 생성자 정의
		public Person(String name, String juminNo) {
			this.juminNo = juminNo;
			System.out.println("this.juminNo" + this.juminNo);
		}
		
		@Override //
		public boolean equals(Object obj) { //
			
			System.out.println(" obj " + obj);
			// Person 타입의 변수 선언
			Person p = null; // p 타입 Person
			
			// obj = Person
			if (obj instanceof Person) { 
				System.out.println("1" + (obj instanceof Person));
//				p = (Person) obj; // obj를 Person으로 형변환
			}
			

			// p가 null이 아니고 주민번호가 일치하면
			// true 반환, 그렇지 않으면 false 반환
			if ( p != null && this.juminNo.equals(p.juminNo)) {
				System.out.println("2" + ( p != null && this.juminNo.equals(p.juminNo)));
				return true;
			}
			
			System.out.println("번호"+ juminNo);
			System.out.println("번호"+ juminNo);
//			System.out.println("3" + ( p != null && this.juminNo.equals(p.juminNo)));
			return false;
		}
		
	}

