<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>서버프로그램 구현 - 체크리스트 1</title>

</head>

<body>

	<h1>회원 정보 조회(회원 번호 검색)</h1>

	<form action="<%=request.getContextPath()%>/selectUser">

		<input type="text" name="userNo" placeholder="회원 번호 입력"> <input
			type="submit" value="조회">

	</form>

</body>

</html>