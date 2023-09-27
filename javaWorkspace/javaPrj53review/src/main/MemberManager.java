package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import data.Member;

public class MemberManager {
	
	//멤버변수
	private Scanner sc = new Scanner(System.in);
	private Map<String, Member> memberMap = new HashMap<String, Member>(); //<key, value> <- Object 가 다 들어가면 안되니까 제한을 걸려고!!
	
	//일 시작
	public void startWork() {
		
		showMenu();
		String input = scanUserString();
		switch(input) {
		case "1" : join(); break;
		case "2" : login(); break;
		default : System.out.println("잘못고름");
		
		}
		
	}
	
	//메뉴 보여주기
	public void showMenu() {
		System.out.println("-----------------------");
		System.out.println("원하시는 메뉴 번호를 입력하세요.");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("-----------------------");
	}

	//입력받기
	public String scanUserString() {
		return sc.nextLine();
	}
	
	//회원가입
	public void join() {
		System.out.println("***** 회원가입 *****");
		
		System.out.print("아이디 : ");
		String id = scanUserString();
		
		System.out.print("비밀번호 : ");
		String pwd = scanUserString();
		
		System.out.print("닉네임 : ");
		String nick = scanUserString();
		
		Member m = new Member(id, pwd, nick);
		
		//값 검증
//		checkValidation(m);
		
		//멤버 객체 저장하기
		memberMap.put(m.getId(), m); //(아이디, 객체)
		
//		m.setId(id);
//		m.setPwd(pwd);
//		m.setPwd(pwd);
		
		System.out.println(m.getId() + "님의 회원가입이 완료되었습니다.");
	}
	
	//값 검증
	private void checkValidation(Member m) throws Exception {
		
		//아이디 검사
		checkId(m.getId());
		//비밀번호 검사
		checkPwd(m.getPwd());
		//닉네임 검사
		checkNick(m.getNick());
	}
	
	//아이디 검사 메소드
	private void checkId(String id) throws Exception {
		if(id.length() < 4) {
			throw new Exception();
		}
		/*
		 * 중복검사 : contains <- collection
		 */
	}
	
	//비밀번호 검사 메소드
	private void checkPwd(String pwd) {
		
	}
	
	//닉네임 검사 메소드
	private void checkNick(String nick) {
		
	}
	
	//로그인
	public void login() {
		System.out.println("***** 로그인 *****");
		
		System.out.print("아이디 : ");
		String userId = scanUserString();
		
		System.out.print("비밀번호 : ");
		String userPwd = scanUserString();
		
		Member x = memberMap.get(userId);
		
		boolean result = userId.equals(x.getId()) && userPwd.equals(x.getPwd());
		if(result) {
			System.out.println("로그인되었습니다.");
		} else {
			System.out.println("※ 아이디 혹은 비밀번호 오류 ※");
		}
	}

}
