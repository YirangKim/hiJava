package Code1;

import java.sql.*;
import java.util.*;
import java.sql.DriverManager;

public class code1Select{
	void start() {
		
		boolean i = true;
		InsertData cs  = new InsertData();
		codeDriver cd = new codeDriver();
		ViewData vd = new ViewData();
		BookRent bv = new BookRent();
		UpdateView chage = new UpdateView();
		DeleteView dv = new DeleteView();
		/* 데이터베이스 관련 코드는 try-catch문으로 예외 처리를 꼭 해주어야 한다. */
		try {
			//데이터베이스 연결
			Class.forName("com.mysql.cj.jdbc.Driver");
			cd.con = DriverManager.getConnection(cd.url, cd.user, cd.passwd);
			cd.stmt = cd.con.createStatement();
			while(i) {
			//메뉴 리스트
				 System.out.println("=== 도서 관리 프로그램 ===");
		         System.out.println("1번 [도서 추가]");
		         System.out.println("2번 [도서 정보 수정]");
		         System.out.println("3번 [도서 삭제]");
		         System.out.println("4번 [도서 조회]");
		         System.out.println("5번 [도서 대여하기]");
		         System.out.println("6번 [끝내기]");
		         System.out.println("============================");
		         
		         System.out.print("번호 입력 : ");
		         Scanner s = new Scanner(System.in);
		         int num = s.nextInt();

			
			switch(num) {
				case 1 :
					cs.insertData();	//도서 추가
					break;
				case 2 :
					chage.changeData();	//도서 수정
					break;
				case 3 :
					dv.removeData();	//도서 삭제
					break;
				case 4 :
					vd.viewData();		//도서 이름으로 검색데이터 조회
						break;
				case 5 :  // 대여
					bv.dates();
					break;
				case 6 : //종료
					System.out.println("도서관리 프로그램을 종료합니다.");
					i= false;
					break;
						
					}
				
			}
		}
			catch(Exception e) {
						System.out.println(e.toString());
			}
		
	}
	
}