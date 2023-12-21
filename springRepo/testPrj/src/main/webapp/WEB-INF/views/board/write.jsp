<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>게시글 작성</h1>
	
	<form action="/app/board/write" method="post">
		<input type="text" name="title" placeholder="제목">
		<br>
		<textarea name="content" placeholer="내용"></textarea>	
		<br>
		<input type="text" name="writer" placeholder="작성자">
	</form>
</body>
</html>