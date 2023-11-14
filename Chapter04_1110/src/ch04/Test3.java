package ch04;

//p170 5번 
public class Test3 {

	public static void main(String[] args) {
		int i = 2, j = 0;
		switch ( i ){ // i가 case i임 : 0 2 4 
			case 0 : j+= 0; 
			case 2 : j+= 2; // j += 2 => j = j + 2 => 2, break가 없어서 계속 진행
			case 4 : j+= 4; // j += 4 => j = j(2) + 4 => 6
			default : j += 6; // j += 6 => j = j(6) + 6 => 12
		}
		System.out.println( j ); // 12
	}

}
