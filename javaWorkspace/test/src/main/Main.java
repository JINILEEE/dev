package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("==== 숫자 맞추기 게임 =====");
		Scanner sc = new Scanner(System.in);
		int com = (int)(Math.random()*10+1);
		
		while(true) {
			int user = sc.nextInt();
			
			if(user == com) {
				System.out.println("일치");break;
			}else {
				System.out.println("불일치");
			}
		}
	
		System.out.println("===== Game over =====");
		
		
	}

}
