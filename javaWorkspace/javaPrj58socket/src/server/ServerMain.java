package server;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMain {

	public static void main(String[] args) throws Exception {
		
		//스캐너 준비
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== Server ====");
		
		//서버 소켓 생성 (연결받을 수 있음)
		ServerSocket serverSocket = new ServerSocket(12345); //12345번 포트port
		
		//연결 대기하기
		System.out.println("연결 대기중 ~~~");
		Socket socket = serverSocket.accept(); 
		InetAddress ineAddr = socket.getInetAddress(); //상대 ip
		System.out.println(ineAddr + "과 연결완료ㄹㅇ롱");
		
		//소켓 스트림 준비
		InputStream in = socket.getInputStream();
		OutputStream out = socket.getOutputStream();
		
		//스트림 준비 (수신)
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr); //(Reader 객체)
		
		//스트림 준비 (발신)
		PrintStream ps = new PrintStream(out);
		
		while(true) {
			//데이터 수신
			String str = br.readLine();
			System.out.println("클라이언트가 보낸 메세지 : " + str);
			
			//데이터 발신
			System.out.println("보낼 메세지 : ");
			String msg = sc.nextLine();
			ps.println(msg);
		}

	}

}
