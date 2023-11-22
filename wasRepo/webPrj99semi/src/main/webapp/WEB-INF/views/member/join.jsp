<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div id="wrap">
	
		<%@ include file="/WEB-INF/views/common/header.jsp" %> 
	
		<main>
			<h1 align="center">회원가입</h1>

			<form action="/app99/member/join" method="post" onsubmit="return checkValidate();">
				<table>
					<tbody>
						<tr>
							<td>* 아이디 : </td>
							<td><input type="text" name="memberId"></td>
						</tr>
						<tr>
							<td>* 비밀번호 : </td>
							<td><input type="password" name="memberPwd"></td>
						</tr>
						<tr>
							<td>* 비밀번호 확인 : </td>
							<td><input type="password" name="memberPwd2"></td>
						</tr>
						<tr>
							<td>* 닉네임 : </td>
							<td><input type="text" name="memberNick"></td>
						</tr>
						<tr>
							<td>전화번호 : </td>
							<td><input type="tel" name="phone"></td>
						</tr>
						<tr>
							<td>이메일 : </td>
							<td><input type="email" name="email"></td>
						</tr>
						<tr>
							<td>주소 : </td>
							<td><input type="text" name="addr"></td>
						</tr>
						<tr>
							<td>취미 : </td>
							<td>
								<label for="ch01">게임</label><input id="ch01" type="checkbox" name="hobbys" value="game">
								<label for="ch02">요리</label><input id="ch02" type="checkbox" name="hobbys" value="cook">
								<label for="ch03">운동</label><input id="ch03" type="checkbox" name="hobbys" value="workout">
								<br>
								<label for="ch04">자바</label><input id="ch04" type="checkbox" name="hobbys" value="java">
								<label for="ch05">자스</label><input id="ch05" type="checkbox" name="hobbys" value="js">
								<label for="ch06">쿼리</label><input id="ch06" type="checkbox" name="hobbys" value="sql">
							</td>
						</tr>
						<tr>
							<td colspan="2"><input type="submit" value="회원가입"></td>
						</tr>
						
					</tbody>
				</table>
			</form>

		</main>
	
	</div>

</body>
</html>

<script>

	function checkValidate(){

		//아이디 길이
		const memberId = document.querySelector("main input[name=memberId]").value;
		const memberIdRegex = /^[a-z0-9]{4,12}$/;

		if(!memberIdRegex.test(memberId)){
			alert("아이디를 올바르게 입력하세요");
			document.querySelector("main input[name=memberId]").focus();
			return false;
		}

		//패스워드 일치여부
		const memberPwd = document.querySelector("main input[name=memberPwd]").value;
		const memberPwd2 = document.querySelector("main input[name=memberPwd2]").value;
		if(memberPwd !== memberPwd2){
			alert("비밀번호가 일치하지 않습니다.");
			document.querySelector("main input[name=memberPwd]").focus();
			return false;
		}

		//패스워드 길이
		if(memberPwd.length < 4){
			alert("비밀번호는 4글자 이상이어야합니다.");
			document.querySelector("main input[name=memberPwd]").focus();
			return false;
		}

		//닉네임 부적절한 단어
		const memberNick = document.querySelector("main input[name=memberNick]").value;
		if(memberNick.includes("admin")){
			alert("부적절한 닉네임입니다.");
			document.querySelector("main input[name=memberNick]");
			return false;
		};

		//이메일 형식(정규식)
		//전화번호 형식(정규식)

		// if(문제있음){
		// 	alert('~~문제가 있음');
		// 	return false;
		// }
		return true;
	}

</script>