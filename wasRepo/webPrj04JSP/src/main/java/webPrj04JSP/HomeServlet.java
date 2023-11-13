package webPrj04JSP;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/home")    // 아래의 메소드들의 실행은 "/home" 이라는 요청을 받을 때 실행한다는 의미 
public class HomeServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 데이터
		String nick = req.getParameter("nick");			// 유저에게 nick값을 받아오
		
		// 비즈니스 로직 == 서비스
		
		// 결과 == 문자열내보내기
//		resp.setContentType("text/html; charset=UTF-8;");
//		resp.getWriter().write("<h1>" + nick + " 님 환영합니다. </h1>");  // ()안의 문자열을 클라이언트 까지 전달
		
//		req.getRequestDispatcher("담당자").forward(req, resp);
		req.getRequestDispatcher("WEB-INF/views/abc.jsp").forward(req, resp);
	
	}

	
}//class
