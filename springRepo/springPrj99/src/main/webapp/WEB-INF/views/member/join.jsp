<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="wrap">
		<%@ include file="/WEB-INF/views/common/header.jsp" %>
		
		<div class="main">
			<form action="/app/member/join" method="post">
				<!-- name 부분은 반드시 우리가 만든 테이블 칼럼명과 동일해야만 한다!!! -->
				<input type="text" name="id" placeholder="아이디">
				<br>
				<input type="password" name="pwd" placeholder="패스워드">
				<br>
				<input type="nick" name="nick" placeholder="닉네임">
				<br>
				<input type="submit" value="회원가입">
			</form>
		</div>
		
	</div>
</body>
</html>