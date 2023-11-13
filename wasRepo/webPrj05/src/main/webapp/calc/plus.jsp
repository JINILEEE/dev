<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <% 
		String str1 = request.getParameter("n1");  // servlet에서는 파라미터를 req 로 작성했으므 req 로 작성한 것이고 여기선 request라고 적어야함.
		String str2 = request.getParameter("n2");
		
		int a = Integer.parseInt(str1);
		int b = Integer.parseInt(str2);
		int result = a+b;
	%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
테스트 ㅋㅋ
	<h1>
		<% out.println(result); %>
	</h1>
	

</body>
</html>