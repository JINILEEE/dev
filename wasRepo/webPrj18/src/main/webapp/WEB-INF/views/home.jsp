<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//String x = (String) request.getAttribute("x");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>홈페이지</h1>
	
	<h3>${x}</h3>
	
	<hr>
	
	<table border="1">
		<tbody>
			<c:forEach items="${voList}" var="vo">
				<tr>
					<td>${vo.title}</td>
					<td>${vo.writer}</td>
					<td>${vo.hit}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<hr>
	
	<%-- <c:if test="${empty loginMember}"> --%>
	<c:if test="${not empty loginMember}">
		<h3>로그인한 유저의 프로필사진</h3>
	</c:if>
	
	<!-- i가 0~9까지 1씩 증가하는 for문 -->
	<c:forEach begin="0" end="9" step="1" var="i">
		<h3>${i}</h3>
	</c:forEach>
	
	<!-- switch문 -->
	<c:choose>
		<c:when test=""></c:when>
		<c:when test=""></c:when>
		<c:when test=""></c:when>
		<c:otherwise></c:otherwise>	
	</c:choose>

</body>
</html>












