<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

    <h1>로그인</h1>

    <form action="/app14/member/login" method="post">
        <table>
            <tr>
                <td>아이디 : </td>
                <td><input type="text" name="memberId"></td>
            </tr>
            <tr>
                <td>비밀번호 : </td>
                <td><input type="password" name="memberPwd"></td>
            </tr>
            <tr></tr>
                <td><input type="submit" value="로그인"></td>
            </tr>
        </table>

    </form>

</body>
</html>