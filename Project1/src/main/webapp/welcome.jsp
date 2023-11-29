<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<link rel = "stylesheet"
href = "https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css
/bootstrap.css">
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<nav class = "navbar navbar-expend navbar-dark bg-dark">
	<div class = "container">
		<div class = "navbar-header">
		<a class = "navbar-brand" href="./welcome.jsp">Home</a>
		</div>	
	</div>
</nav>
	<%! String greeting = "Welcom to Web Server Mall";
		String tagline = "Welcom to Web Market!"; %>
	
	<div class="jumbotron">
		<div class="container" >
		<h1><%=greeting  %></h1>
		</div>
	</div>
	
	<div class="container"  >
		<div class="text-center" >
		<h3><%=tagline %></h3>
		
		
		
		</div>
	</div>
	<footer class="container">
	<p>&copy;  WebMarket</p>	
	</footer>
	
	
</body>
</html>