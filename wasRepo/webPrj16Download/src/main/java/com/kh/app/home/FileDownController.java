package com.kh.app.home;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/file/download")
public class FileDownController extends HttpServlet{

	//다운로드 요청 처리할 메소드
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String path = req.getServletContext().getRealPath("/resources/profile");
		String fileName = "/abc.png";
		File f = new File(path + fileName);
		
		resp.setHeader("Content-Type", "application/octet-stream");
		resp.setHeader("Content-Disposition", "attachment; filename=zzz.png");
		resp.setHeader("Content-Length", String.valueOf(f.length()));
		
		FileInputStream is = new FileInputStream(f);
		
		ServletOutputStream out = resp.getOutputStream();
		
		byte[] buf = new byte[1024];
		int size = 0;
		while((size = is.read(buf)) != -1) {
			out.write(buf, 0, size);
		}
	
	}
}//class
