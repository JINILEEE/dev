<%@page import="edu.kh.test.user.model.vo.UserDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <% 
 	UserDTO vo = (UserDTO)session.getAttribute("vo");
 %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 조회 성공</title>
</head>
<body>
    <h1>회원정보</h1>
	<table>
        <thead>
            <tr>
                <td>회원번호</td>
                <td>회원아이디</td>
                <td>회원이름</td>
                <td>회원나이</td>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td><%= vo.getUserNo() %></td>
                <td><%= vo.getUserId() %></td>
                <td><%= vo.getUserName() %></td>
                <td><%= vo.getUserAge() %></td>
            </tr>
        </tbody>
    </table>
    <a href="/Test1">메인페이지로 돌아가기</a>
</body>
</html>