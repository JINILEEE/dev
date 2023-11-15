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
	
	<br>
	<form action="/app12/board/write" method="POST">
		<table>
			<tbody>
				<tr>
					<td>제목 </td>
					<td><input type="text" name="title"></td>
				</tr>
				<tr>
					<td>내용 </td>
					<td><textarea cols="20" rows="7" name="content"></textarea></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="게시글 작성"></td>
				</tr>
			</tbody>
		</table>

	</form>

</body>
</html>