package ch03;

public class PrefixOperator {

	public static void main(String[] args) {
		
		int num1 = 5;
		// 후위 연산자이기 때문에 num1데이터가 그래도 num2에 저장
		// 이후에 num1 값은 +1이 되어 num1에 저장 된다
		// num1의 6이 된다 
		// num1 = num1 + 1 
		// num1값 증가 후 대입연산
		int num2 = ++num1; 
		
		System.out.println("num1의 값 : " + num1 );
		// num1++ 6이 된다 
		// 후입 연산자이기 때문에 저장되는 데이터는 나중에 연산된 결과가 된다
		System.out.println("num1의 값 : " + num2 );
		System.out.println("++num1의 값 : " + ++num1 );
		
	}

}
