package ch05;

public class Adder {
	
	int n1;
	int n2;
	float n3;
	float n4;
	
	// 자동생성자
	int add ( int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
		//return n1 + n2;
	}

	float add1 (float n3, float n4) {
		this.n3 = n3; //타입이 같아야함
		return n1 + n2;
	}
}
