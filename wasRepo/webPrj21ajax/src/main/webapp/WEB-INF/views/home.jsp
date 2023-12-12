<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>홈페이지@.@</h1>
	
	<button onclick="fff();">서버한테서 데이터 받아오기</button>
	
	<hr>
	
	<button onclick="sendData();">서버한테 데이터 보내기</button>
	
	<script>
		function fff (){
			fetch("/app21/board/list")
			.then((resp)=>{ return	resp.json(); })
			.then( (data) => {console.log(data);} );
		}
		
		function sendData(){
			
			const x = {
					title : "ttt01",
					content : "ccc01"
			};
			
			// 경로 , 방식(or 헤더에 어떤것 담고 바디에 어떤것 담을지 설정가능) => 객체를 담아주는 것이다.
			// 이렇게 생성한 것을 실행해줄 promise객체를 생성하는 것이다.
			fetch("/app21/test", {
				method: "post",
				//header: ~~~ ,
				
				// 자바스크립트객체 x 를 JSON 형태로 문자열을 처리하겠다는 의미
				body: JSON.stringify(x)
				// 혹은 이렇게 작성하기 => body: '{str:hello}'
			})
			.then(resp => resp.json())
			.then(data => {console.log(data);})
			.catch(() => {console.log("catch 블럭!!!")})
			;
		}
		
	</script>

</body>
</html>