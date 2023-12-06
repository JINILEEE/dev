<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>홈페이지:D</h1>
	
	<button onclick="f01();">버튼@.@</button>
	
	<script>
		function f01(){
			
			//서버에 요청 보내기
			fetch("http://127.0.0.1:8888/app17/test")
			.then((resp) => { return resp.json() })
			.then((x) => { 
				console.log(x);
				console.log(x.title);
				console.log(x.content);
			 });
		}
	</script>

</body>
</html>