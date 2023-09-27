package game.updown;

import main.Main;

public class UpDownGameManager {
	
	public void startGame() {
		
		//시도횟수
		int cnt = 0;
		
		//정답 준비 (랜덤 1~100)
		int answer = (int)(Math.random() * 100 + 1);
		while(true) {
			//유저 입력받기
			System.out.print("1~100 사이의 정수를 입력하세요. : ");
			String num_ = Main.scanUserInput();  //Temp : 임시
			int num = Integer.parseInt(num_);
			cnt++;
			
			//판단  //업,다운 정답]
			if(num == answer) {
				System.out.println("정답"); 
				break;
			} else if(num > answer) {
				System.out.println("DOWN");
			} else {
				System.out.println("UP");
			}
		}
		
		//시도횟수 출력
		System.out.println("시도횟수 : " + cnt);
		
	}

}
