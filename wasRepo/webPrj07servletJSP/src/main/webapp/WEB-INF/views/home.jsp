<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <% 
    	String a = (String)request.getAttribute("k01");    //request.getAttribute 는 객체를 넣어줘야 하는 것이라 
    	String b = (String)request.getAttribute("color");  //casting을 통해 type을 String으로 맞춰주기!!!
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>홈 JSP</h1>
	
	<h2><%=a %></h2>
	<h2><%=b %></h2>

</body>
</html>