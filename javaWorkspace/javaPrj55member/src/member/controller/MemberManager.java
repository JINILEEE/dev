package member.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class MemberManager {
	
	private Scanner sc;
	private File f;
	private PrintWriter pw; //PrintStream도 가능
	private BufferedReader br;
	
	public MemberManager() throws Exception{
		sc = new Scanner(System.in); 
		String x = File.separator; // 또는 File.separator;
		f = new File("D:" + x + "dev" + x + "data.txt");  //문자열 사이사이에 띄어쓰기 x 예) "D: ", " dev" 이런거
		pw = new PrintWriter(new FileWriter(f, true), true);  // 예외 처리하기 위해 생성자 안쪽에 저장 // new PrintWriter((Writer 객체), 자동으로 flush(boolean 타입 값);
														// 덮어쓰기 가능 : new FileWriter(f, true(어펜트(=이어쓰기)), true) 
//		br = new BufferedReader(new FileReader(f));
	}
	
	//메뉴
	public void showMenu() throws Exception {
		System.out.println("------메뉴-----");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 전체 회원 조회\n");
		System.out.println("원하시는 메뉴 번호를 입력하세요.");
		
		String menu = sc.nextLine();
		
		switch(menu) {
		case "1" : join(); break;
		case "2" : login(); break;
		case "3" : selectAllUser(); break;
		default : System.out.println("잘못입력하셨습니다.");
		}
		
	}
	
	//회원가입
	private void join() throws Exception {
		//유저한테 데이터(아이디,비번,닉네임) 입력받기
		System.out.println("*** 회원가입 ***");
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String pwd = sc.nextLine();
		
		System.out.print("닉네임 : ");
		String nick = sc.nextLine();
		
		//데이터 검사
		boolean isError = id.contains("#"); // id 가 "#"을 포함하면 안됨 
		if(isError) {
			throw new Exception("아이디에는 # 을 사용할 수 없습니다.");
		}
		
		//파일(메모장)에 저장하기
		pw.println(id + "#" + pwd + "#" + nick);
		
		System.out.println("회원가입이 완료되었습니다.");
		
	} //join end
	
	
	//로그인
	private void login() throws Exception{
		br = new BufferedReader(new FileReader(f));
		System.out.println("*** 로그인 ***");
		//유저한테 데이터(아이디,비번) 입력받기
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String pwd = sc.nextLine();
		
		boolean isOk = false;
		while(true) {
			//파일에서 회원정보 조회
			String str = br.readLine();
			if(str == null) {
				break;
			}
			//회원정보에서 id, pwd 만 꺼내기
			int idx = str.indexOf("#");  //첫번째 # //indexOf(값) : 앞에서부터 읽음
			String memoId = str.substring(0, idx); //특정문자열 잘라오기 //(0(<=) , 첫번째샾(<))
			
			int idx2 = str.lastIndexOf("#");//뒤에서부터 채워서 
			String memoPwd = str.substring(idx+1, idx2); //(비번시작(인덱스 그 다음),두번째샾)
			
			//일치 여부 확인
			isOk = id.equals(memoId) && pwd.equals(memoPwd);
			if(isOk) {
				break;
			}
		} //while end
		
		if (isOk) {
			System.out.println("로그인 되었습니다.\n");
			
			//할일 : 닉네임 님 환영합니다 ~!
		} else {
			System.out.println("아이디 또는 비밀번호가 일치하지 않습니다. 다시 입력하세요.");
		}
		
	} // login end
	
	//모든 회원 정보 조회
	private void selectAllUser() throws Exception {
		br = new BufferedReader(new FileReader(f));
		//파일에서 모든 정보 읽기
		while(true) {
			String str = br.readLine();
			if(str == null) {
				break;
			}
			System.out.println(str);
		}
	} //selectAllUser end

} //class










