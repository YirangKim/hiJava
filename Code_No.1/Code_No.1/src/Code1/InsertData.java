package Code1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class InsertData{
	
	 codeDriver cd = new codeDriver();
	    void insertData() {
	         
	         Scanner insert = new Scanner(System.in);
	         System.out.println("==== 도서 정보 등록 ====" );
	         System.out.println("1번 [전체 정보 등록] "); // case 1
	         System.out.println("2번 [부분 정보 등록]"); // case 2
	            System.out.print("번호를 입력해주세요 : ");
	            int menu = insert.nextInt();
	            
	            switch(menu) {
	            case 1:
	               
	               try {
	                  Scanner insert1 = new Scanner(System.in);
	                      System.out.print("도서번호 입력 : " );
	                    int Bookid = insert1.nextInt();   
	                    
	                    insert1.nextLine();
	                    
	                  System.out.print("도서명 입력\t: " );
	                    String Bname = insert1.nextLine();
	                    
	                    System.out.print("저자 입력\t: ");
	                    String Author = insert1.nextLine();
	                    
	                    System.out.print("카테고리 입력 : ");
	                    String Category = insert1.nextLine();
	                    
	                    System.out.print("출판사 입력\t: ");
	                    String Publisher = insert1.nextLine();
	                    
	                    System.out.print("발행일 입력 : ");
	                    String Dates = insert1.nextLine();
	                    
	                    System.out.print("가격 입력\t: ");
	                    int Price = insert1.nextInt();
	                  
	                    insert1.nextLine();
	                    
	                    System.out.println("도서번호\t: "+Bookid+"\n도서명\t: " +Bname+"\n저자\t: "+Author+"\n카테고리\t: "+ Category +
	                          "\n출판사\t: "+ Publisher +"\n발행일\t: "+Dates+"\n가격\t: "+Price   );
	                    System.out.print("입력한 정보를 등록하겠습니까? y/n : ");
	                    String a1 = insert1.nextLine();
	                 
	                    if(a1.equals("y")) {
	                       String insertStr = "INSERT INTO codeNo1(Bookid,Bname,Author,Category,Publisher,Dates,Price)"
	                                      +" VALUES("+Bookid+",'" + Bname +"','"+Author+"','"+Category+"','"+Publisher+"','"+Dates+"',"+Price+")" ;
	                       cd.stmt.executeUpdate(insertStr);
	                       
	                       System.out.println("정보가 정상적으로 입력되었습니다.");
	                    } else if(a1.equals("n")) {
	                       System.out.println("정보가 등록되지 않습니다.");
	                    }
	               } catch(Exception e) {
	                  System.out.println("입력에 실패했습니다.  "+ e.toString());
	               }
	               break;
	               
	            case 2:
	                  
	            try {
	               Scanner insert2 = new Scanner(System.in);
	                  
	                   System.out.print("도서번호 입력 : " );
	                 int Bookid = insert2.nextInt();   
	                 
	                 insert2.nextLine();
	                 
	               System.out.print("도서명 입력\t: " );
	                 String Bname = insert2.nextLine();
	                 
	                 System.out.print("가격 입력\t: ");
	                 int Price = insert2.nextInt();
	                
	                 insert2.nextLine();
	                 
	                 System.out.println("도서번호\t: "+Bookid+"\n도서명\t: " +Bname+"\n가격\t: "+Price   );
	                 System.out.print("입력한 정보를 등록하겠습니까? y/n : ");
	                 String a1 = insert2.nextLine();
	                 
	                 if(a1.equals("y")) {
	                    String insertStr = "insert into codeNo1(Bookid,Bname,Price) values("+Bookid+",'"+Bname+"',"+Price+")";
	                       cd.stmt.executeUpdate(insertStr);
	                    
	                    System.out.println("정보가 정상적으로 입력되었습니다.");
	                 } else if(a1.equals("n")) {
	                    System.out.println("정보가 등록되지 않습니다.");
	                 }
	               
	            } catch(Exception e) {
	               System.out.println("입력에 실패했습니다. "+ e.toString());
	            }
	            break;
	           }
	         }
}