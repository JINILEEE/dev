package com.kh.app.home;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.kh.app.board.vo.BoardVo;

@WebServlet("/test")
public class Test extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		System.out.println("doget called!!!");
		String str = req.getParameter("str");
		System.out.println("str : " + str);
		resp.getWriter().write("{\"msg\":\"good\"}"); //JSON형태로만든 것이다.
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("dopost called!!!");
		
		//body에 담긴 데이터 읽기
		BufferedReader br = req.getReader();
		
		String bodyData = "";
		String temp = "";
		while((temp = br.readLine()) != null) {
			
			//body에 담긴 데이터 한줄한줄을 그대로 읽기
			//String temp = br.readLine();  <- 나눠서 위에 작성함 반복문 조건에 넣어줌
			
			//위에서 읽은 한줄하준을 누적해서 bodyData에 당ㅁ아주기!
			bodyData +=temp; 
			
		}
		System.out.println("bodyData : " + bodyData);
		
		//읽어들인 문자열(JSON 형태) 가공하기
		Gson gson = new Gson();
		
		//gson.fromJson(문자열, 타입) 을 넣으면 된다.
		BoardVo vo = gson.fromJson(bodyData, BoardVo.class);
		System.out.println("JSON 문자열을 이용해서 만들어진 객체 : " + vo);
		
		
		resp.getWriter().write("{\"msg\":\"good\"}");
		
	}
	
	
}//class


