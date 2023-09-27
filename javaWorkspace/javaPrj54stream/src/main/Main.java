package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
//import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintStream;

public class Main {

	public static void main(String[] args) throws Exception {

		System.out.println("===== 스트림 =====");
		
		File f = new File("D:\\dev\\hello.txt");
//		f.delete();  //파일 삭제
		
		//1byte 단위로 처리 - 별로였음..
//		FileOutputStream fos = new FileOutputStream(f);
//		fos.write(70);
		
//		FileWriter fw = new FileWriter(f);
//		fw.write("집갈래 ");  // 내보내는거 x -> 통로에 담아두는거 ex) 카톡 메세지 보낼 내용 입력하고, 전송하기 전 상태. 
//		fw.flush(); // flush : 물내리다 (뭔가 막혀있을 때 물내리는 것처럼 꾹 눌러서 내려준다)
		
//		PrintStream ps = new PrintStream(f);
//		ps.println("테스트");
		
		//======================================
		
//		FileInputStream fis = new FileInputStream(f);
//		for(int i = 0; i < 3;i++) {
//			int result = fis.read();
//			char x = (char)result;
//			System.out.println(x);
//		}	
		
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr); // BufferedReader(리더객체);
		
		for(int i = 0; i < 2; i++) {
			String result = br.readLine(); // readLine : 한 줄만 읽어옴
			System.out.println(result);
		}
		
	} //main

} //class
