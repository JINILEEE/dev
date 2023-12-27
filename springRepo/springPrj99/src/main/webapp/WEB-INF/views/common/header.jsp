<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<style>
	body{
		padding: 0px;
		margin: 0px;
		box-sizing: border-box;
	}
	.wrap{
		width: 100vw;
		height: 100vh;
		display: grid;
		grid-template-rows: 20vh 10vh 60vh 10vh;
		grid-template-columns: 1fr;
		place-items: center center;
	}
	.header{
		width: 60%;
		height: 100%;
		background-color:gray;
		display: grid;
		grid-template-columns: 1fr 3fr 1fr;
		grid-template-rows: 1fr;
	}

	.navi{
		width: 100%;
		height: 60%;
		display: grid;
		grid-template-columns: repeat(4, 1fr);
		grid-template-rows: 1fr;
		place-items: center center;
	}

	.loginArea{
		width: 100%;
		height: 100%;
	}

	.loginArea > form {
		width: 100%;
		height: 100%;
		display: grid;
		grid-template-columns: 1fr 1fr;
		grid-template-rows: 1fr 1fr 1fr;
	}

	.loginArea > form > input:nth-child(1),
	.loginArea > form > input:nth-child(2){
		grid-column: span 2;
	}
</style>
	
	
<div class="header">
	<h1>빈칸</h1>
	<h1>로고</h1>
	<div class="loginArea">
		<form action="/app/member/login" method="post">
			<input type="text" placeholder="아이디">
			<input type="password" placeholder="패스워드">
			<input type="button" value="회원가입" onclick="location.href='/app/member/join'">
			<input type="submit" value="로그인">
		</form>
	</div>
</div>

<div class="navi">
	<div>게시판</div>
	<div>공지사항</div>
	<div>갤러리</div>
	<div>마이페이지</div>
</div>