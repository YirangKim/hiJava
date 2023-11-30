package ch01;

import java.sql.*;
import java.util.*;
import java.util.Scanner;

public class DatabaseMain extends Database {
		
	public static void main(String[] args) {
		
		DatabaseMain db = new DatabaseMain(); //객체 생성
		// System.out.println("db는" + db);
	    
		/* 데이터베이스 관련 코드는 try-catch문으로 예외 처리를 꼭 해주어야 한다. */
		try { //데이터베이스 연결
			Class.forName("com.mysql.cj.jdbc.Driver"); //드라이버 로드 성공
			db.con = DriverManager.getConnection(db.url, db.user, db.passwd); //데이터베이스 접속
			System.out.println("데이터베이스 연결 성공");
			db.stmt = db.con.createStatement(); //객체생성 db.stmt에 저장
			
			while(true) {
			//메뉴 리스트
			System.out.println("=== 도서 관리 프로그램 ===");	
			System.out.println("[1] 테이블 생성");
			System.out.println("[2] 데이터 추가");
			System.out.println("[3] 데이터 삭제");
			System.out.println("[4] 데이터 변경");
			System.out.println("[5] 데이터 조회");
			
			System.out.print("= 번호 입력 : ");
			Scanner s = new Scanner(System.in);
			int num = s.nextInt();
			
			switch(num) {
				case 1 :
					db.createTable();	//테이블 생성
					break;
				case 2 :
					db.insertData();	//데이터 삽입
					break;
				case 3 :
					db.removeData();	//데이터 삭제
					break;
				case 4 :
					db.changeData();	//데이터 수정
					break;
				case 5 :
					db.viewData();		//데이터 조회
					break;
			}
		  }
		} catch(Exception e) {
			System.out.println(e.toString());
		} finally {
			try {
				db.stmt.close();
				db.con.close();				
			} catch(Exception e) { // 예외 발생
				System.out.println(e.toString());
			}
		}
	
	}

	
}
