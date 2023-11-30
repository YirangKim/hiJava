package ch01;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Database {
	
	Connection con = null;
	Statement stmt = null; // 데이터베이스 상호작용
	String url = "jdbc:mysql://localhost:3306/madang?serverTimezone=Asia/Seoul"; //dbstudy스키마
	String user = "madang";
	String passwd = "madang";	//MySQL에 저장한 root 계정의 비밀번호를 적어주면 된다.
	String date = "";
	String tableName = null;

	// 생성 완료
	void createTable() {
		try {
			Scanner s = new Scanner(System.in);
			System.out.print("테이블 이름을 입력하세요 >>");
			tableName = s.nextLine();
			
			 // 열 정의에 NOW() 포함
	        String createStr = "CREATE TABLE " + tableName + "(name varchar(10) not null, id varchar(20) not null,"
	        		+ "password varchar(20) not null, "
	        		+ "date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,"
	        		+ " PRIMARY KEY (id))";
	        stmt.execute(createStr); // execute 함수 
			
			System.out.println("테이블 생성 성공!");
			
		} catch(Exception e) {
			System.out.println("테이블 생성 실패 이유 : " + e.toString());
		}
	}
	
	//삽입 완료
	void insertData() {
		try {
			Scanner insert = new Scanner(System.in);
			System.out.print("데이터를 추가할 테이블 이름을 입력하세요 >>");
			String insertTableName = insert.nextLine();
			
			System.out.print("이름 입력: ");
	        String name = insert.nextLine();

	        System.out.print("ID 입력: ");
	        String id = insert.nextLine();

	        System.out.print("비밀번호 입력: ");
	        String passwd = insert.nextLine();
	        
	        String insertStr = "INSERT INTO " + insertTableName + " VALUES('" + name + "', '" + id + "', '" + passwd + "', NOW())";
	        stmt.executeUpdate(insertStr);
			
			System.out.println("데이터 추가 성공!");
		} catch(Exception e) {
			System.out.println("데이터 추가 실패 이유 : " + e.toString());
		}
	}

	//삭제 완료
	void removeData() {
		try {
			Scanner remove = new Scanner(System.in);
			System.out.print("데이터를 추가할 테이블 이름을 입력하세요 >>");
			String tableName = remove.nextLine();
			
			System.out.print("삭제할 이름을 입력하세요 >>");
	        String name = remove.nextLine();
			
			String removeStr = "DELETE FROM " + tableName + " WHERE name='" + name + "'";
	        stmt.executeUpdate(removeStr);
			System.out.println("데이터 삭제 성공!");
		} catch(Exception e) {
			System.out.println("데이터 삭제 실패 이유 : " + e.toString());
		}
	}

	//수정 완료
	void changeData() {
		try {
			Scanner change = new Scanner(System.in);
			System.out.print("데이터를 수정 할 테이블 이름을 입력하세요 >>");
			String tableName = change.nextLine();
			
			System.out.println("수정할 내용을 입력하세요 항목='변경할 값' >>");
			String newValue = change.nextLine();
			
			System.out.println("");
			String columnName = change.nextLine();
			
			
			String changeStr = "UPDATE " + tableName + " SET " + columnName + " where " + newValue;
			stmt.executeUpdate(changeStr);
			System.out.println("데이터 변경 성공!");
		} catch(Exception e) {
			System.out.println("데이터 변경 실패 이유 : " + e.toString()); 
		}
	}

	//조회 완료 
	void viewData() {
		try {
			Scanner view = new Scanner(System.in);
			System.out.print("데이터를 추가할 테이블 이름을 입력하세요 >>");
			String tableName = view.nextLine();
			
			System.out.println("== user 테이블 조회 ==");
			
			String viewStr1 = "SELECT * FROM " + tableName;
			ResultSet result1 = stmt.executeQuery(viewStr1); //Query

			while(result1.next()) {
				System.out.print(result1.getString("name") + "\t" + result1.getString("id")
								 + "\t" + result1.getString("password") + "\n");
			}
			
			System.out.println("");
			System.out.println("데이터 조회 성공!");
		} catch(Exception e) {
			System.out.println("데이터 조회 실패 이유 : " + e.toString());
				}
	
		}
}
