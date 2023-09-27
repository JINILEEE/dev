package game.updown;

import main.Main;

public class RcpGameManager {
	
	public void startGame() {
		
		
		int answer = (int)(Math.random() * 3 + 1);
		while(true) {
			System.out.print("가위/바위/보 셋 중 하나를 입력하세요 : ");
			String num_ = Main.scanUserInput();
			int num = Integer.parseInt(num_);
			
			if(num == answer) {
				System.out.println("가위");
			} else if(num > answer) {
				System.out.println("바위");
			} else {
				System.out.println("보");
			}
			
		}
//		
//		String num_ = Main.scanUserInput();
//		int num = Integer.parseInt(num_);
		
//		if(com)
		
	} 	

}	//class
