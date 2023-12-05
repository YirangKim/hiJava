package Code1;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class codeDriver {
	
		 static Connection con = null;
		 static Statement stmt = null;
		 
		 void login() throws SQLException {
			 String url = "jdbc:mysql://localhost:3306/madang?serverTimezone=Asia/Seoul";
			 Scanner sc = new Scanner(System.in);
			 System.out.print("아이디 : ");
			 String id = sc.nextLine();
			 System.out.print("비밀번호 : ");
			 String passwd = sc.nextLine(); 
			 
			con = DriverManager.getConnection(url,id,passwd);
			stmt = con.createStatement();
		 }
}

