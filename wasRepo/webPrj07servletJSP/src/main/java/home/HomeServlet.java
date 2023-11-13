package home;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class HomeServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		//데이터
		
		//비즈니스
		
		//결과 (== 문자열 내보내기)
//		resp.setContentType("text/html; charset=UTF-8");
//		PrintWriter out = resp.getWriter();
//		out.write("<h1>홈페이지</h1>");         				//여기 write에 작성된것 보임
		
		// jsp에 작성한 것 보여주는 방법
		req.setAttribute("k01", "v01");
		req.setAttribute("color", "red");
		req.getRequestDispatcher("WEB-INF/views/home.jsp").forward(req,resp); // 일단 한줄로 req, resp를 "WEB-INF/views/home.jsp" 에 넘긴다는 의미로 해석하기!!!
		
		
	
	}
	
}
