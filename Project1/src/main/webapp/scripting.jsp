<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>Scripting tag</h2>
	<%! int count = 3; //변수 호출
		String makeItLower(String data){ // 메소드 
			return data.toLowerCase();
		}
	%>
	
	<% for(int i=1; i <= count; i++){
		out.println("Java Server Pages " +i+".<br>");		
	} 
	%>
	
	<%= makeItLower("Hello world") %>
</body>
</html>