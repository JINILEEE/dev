<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	String str1 = request.getParameter("n1");
    	String str2 = request.getParameter("n2");
    	
    	int result = Integer.parseInt(str1) - Integer.parseInt(str2);
    %>
    
    <%-- jsp 주석 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>
		<% out.println(result); %>
	</h1>
		<%= result %>       <!-- 결과값만 출력해주는 태그 -->

	<%-- jsp 주석 --%>
	
</body>
</html>