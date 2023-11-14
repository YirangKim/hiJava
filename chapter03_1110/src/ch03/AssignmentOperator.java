package ch03;

public class AssignmentOperator {

	public static void main(String[] args) {
		
		int num = 10;
		
		num += 5;
		System.out.println(num);
		
		num -= 5;
		System.out.println(num);
		
		num *= 2;
		System.out.println(num);
		
		num /= 2;
		System.out.println(num);
		
		num %=3;
		System.out.println(num);
		
		short snum1 = 20;
		short snum2 = 30;
		
		snum1 += snum2;
		System.out.println(snum1);

		//num=snum1=snum2;
		//System.out.println("num =" + num);
		
		// 오른쪽 값이 왼쪽으로 대입 
		num = snum1 = snum2;
		System.out.println("num = " + num);
		System.out.println("snum1 =" +snum1);
		System.out.println("snum2 =" + snum2);
	}

}
