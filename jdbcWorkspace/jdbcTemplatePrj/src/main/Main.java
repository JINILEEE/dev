package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) throws Exception {

		System.out.println("hihi");
		
		File f = new File("info.txt");
		
		//BufferedReader br = new BufferedReader(new FileReader(f));  // 위의 파일을 읽기 위해 리더 추가한것
		
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);  //위에 주석처리한 한줄이랑 이번 두줄이랑 동일한 것
		
		String url = br.readLine();
		String username = br.readLine();
		String pwd = br.readLine();
		
		System.out.println(url);
		System.out.println(username);
		System.out.println(pwd);
		
	}//main

}//class
