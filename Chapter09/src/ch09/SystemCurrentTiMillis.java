package ch09;

public class SystemCurrentTiMillis {

	public static void main(String[] args) {
		
		// 작업 시작 시간을 변수에 저장
		long startTime = System.currentTimeMillis();
		
		for(int i=0; i<1000000000; i++) {
			int n1 = 1;
			int n2 = 10;
			int sum = n1 + n2;
		}

		// 작업 종료 시간을 변수에 저장
		long endTime = System.currentTimeMillis();
		
		long estimatedTime = endTime - startTime;
		System.out.println("해당 기능의 실행 시간 : " + estimatedTime );
	}

}
