package ch01;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class codeNo1 {
	
	Connection con = null;
	Statement stmt = null; // 데이터베이스 상호작용
	int Bookid = 0; 
	String Bname = null;
	String Author = null;
	String Category = null;
	String Publisher = null;
	int Dates = 0;
	int Price = 0;
	String url = "jdbc:mysql://localhost:3306/madang?serverTimezone=Asia/Seoul"; //dbstudy스키마
	String user = "madang";
	String passwd = "madang";	//MySQL에 저장한 root 계정의 비밀번호를 적어주면 된다.
	String day = ""; // 00월 00일 00시 분
	String tableName = null;

	/* 테이블 생성
	void createTable() {
		try {
			Scanner s = new Scanner(System.in);
			System.out.print("테이블 이름을 입력하세요 >>");
			tableName = s.nextLine();
			
			 // 열 정의에 NOW() 포함
	        String createStr = "CREATE TABLE " + tableName + "(Bookid integer not null primary key,"
	        		+ "Bname varchar(40),"
	        		+ "Author varchar(40), "
	        		+ "Category varchar(40), "
	        		+ "Publisher varchar(40), "
	        		+ "Dates varchar(40),"
	        		+ "Price integer)";
	        stmt.execute(createStr); // execute 함수 
			
			System.out.println("테이블 생성 성공!");
			
		} catch(Exception e) {
			System.out.println("테이블 생성 실패 이유 : " + e.toString());
		}
	}
	*/
	
	//삽입 완료
	void insertData() {
		try {
			Scanner insert = new Scanner(System.in);
			System.out.println("====도서 정보 등록====" );
			
	        System.out.println("ID 입력 : " );
	        int Bookid = insert.nextInt();			
	        
	        insert.nextLine();
	        
			System.out.println("도서명 입력 : " );
	        String Bname = insert.nextLine();

	        System.out.println("저자명 입력 : ");
	        String Author = insert.nextLine();
	        
	        System.out.println("카테고리 입력 : ");
	        String Category = insert.nextLine();
	        
	        System.out.println("출판사 입력 : ");
	        String Publisher = insert.nextLine();
	        
	        System.out.println("발행일 입력 : ");
	        int Dates = insert.nextInt();
	        
	        System.out.println("가격 입력 : ");
	        int Price = insert.nextInt();
	        
	        String insertStr = "INSERT INTO "+"codeNo1"+ " VALUES("+Bookid+",'" + Bname +"','"+Author+"','"+Category+"','"+Publisher+"','"+Dates+"',"+Price+")" ;
	        stmt.executeUpdate(insertStr);
			
			System.out.println("도서 정보 등록이 완료되었습니다.");
		} catch(Exception e) {
			System.out.println("도서 정보 등록에 실패하였습니다. ");
			System.out.println(e.toString());
		}
	}

	//삭제 완료
	void removeData() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("<< 메뉴를 선택하세요 >>");
		System.out.println("1.   테이블 행  전체 삭제"); // case 1
		System.out.println("2.   테이블 행  일부 삭제"); // case 2
		int menu = sc.nextInt();
		switch(menu) {
		case 1:
			try {
				Scanner delete = new Scanner(System.in);
				
				System.out.print("전체 행 삭제 테이블 이름을 입력하세요" );
		        String tableName = delete.nextLine();
				
				String removeStr = "drop FROM"  + tableName +  "";
		        stmt.executeUpdate(removeStr);
				System.out.println(	"전체 행 삭제 성공!");
			} catch(Exception e) {
				System.out.println("전체 행 삭제 실패 이유  "+ e.toString());
			}
		case 2:
				
		try {
			Scanner delete = new Scanner(System.in);
			System.out.print("일부 행 삭제 테이블 이름을 입력하세요" );
			String tableName = delete.nextLine();
			
			System.out.print("삭제할 bookid 번호를 입력하세요" );
	        String bookid = delete.nextLine();
			
			String removeStr = "DELETE FROM"  + tableName +  "WHERE  bookid="+ bookid +"";
	        stmt.executeUpdate(removeStr);
			System.out.println("일부 행 삭제 성공!");
		} catch(Exception e) {
			System.out.println("일부 행 삭제 실패 이유   "+ e.toString());
		}
	  }
	}
	
	

	//수정 완료
	void changeData() {
		try {
			
			System.out.println("=== 도서 추가, 수정 ===");
					
			Scanner change = new Scanner(System.in);
			
			System.out.println("수정할 도서의 Bookid 입력: ");
			int bookID = change.nextInt();
			change.nextLine();
			
			System.out.print("도서명 :" );
			String bname = change.nextLine();
			
			System.out.print("작가 :" );
			String author = change.nextLine();
			
			System.out.print("카테고리 : ");
	        String category = change.nextLine();

	        System.out.print("출판사 : ");
	        String publisher = change.nextLine();

	        System.out.print("출판일 : ");
	        String dates = change.nextLine();

	        System.out.print("가격 : ");
		    int price = change.nextInt();
						
						
	        String changeStr = "UPDATE table_name SET Bname='" + bname + "', Author='" + author + "', Category='" + category
	                + "', Publisher='" + publisher + "', Dates='" + dates +
	                "', Price=" + price + " WHERE Bookid=" + bookId;
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
