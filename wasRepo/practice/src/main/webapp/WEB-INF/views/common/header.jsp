<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 
    String x = (String) session.getAttribute("alertMsg");
    session.removeAttribute("alertMsg");
%>

<script>
    <% if(x != null) { %>
        alert('<%= x %>');
    <% } %>
</script>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>