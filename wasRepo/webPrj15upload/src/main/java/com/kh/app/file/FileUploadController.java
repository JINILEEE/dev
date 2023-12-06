package com.kh.app.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig(
		maxFileSize = 1024 * 1024 * 100  		//파일 하나당 크기
		, maxRequestSize = 1024 * 1024 * 50  	//리퀘스트 전체 크기
		)
@WebServlet("/file/insert")
public class FileUploadController extends HttpServlet{

	//파일 업로드 처리
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("메소드 호출 ㅇㅋ");
		Part f = req.getPart("f");
		System.out.println(f);
		System.out.println(f.getSubmittedFileName());  //원래 파일이름을 얻어 올 수 있다.
		
		//읽기 준비
		InputStream in = f.getInputStream();
		
		//내보내기 준비
		String sep = File.separator;    //구분자가 운영체제에 따라 다르게 출력이 가능해서....
		String path = req.getServletContext().getRealPath(sep + "resources" +sep + "upload"+ sep + "img");
		String fileName = sep + "codingplz.png";
		File target = new File(path + fileName);
		FileOutputStream out = new FileOutputStream(target);
		
		//1.하나 읽고, 하나 내보내고 ... 반복하는 방 
//		int data = 0;
//		while((data = in.read()) != -1) {
//			out.write(data);
//		}
		
		//2.1024개씩 읽고 내보내는 방식 - 이 방법이 1번보다 효율적이다.
		byte[] buf = new byte[1024];
		int size = 0;
		while((size = in.read(buf)) != -1){     // 몇 글자를 읽었는지 그 사이즈를 알려준다.
			out.write(buf, 0, size);
		}
		
		//정리
		in.close();
		out.close();
		
	}
	
}//class
