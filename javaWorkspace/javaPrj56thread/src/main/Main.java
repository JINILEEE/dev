package main;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("===== 쓰레드 =====");
		
		//현재 쓰레드 이름 확인
//		Thread x = Thread.currentThread(); 
//		System.out.println(x.getName());
		
		//방법1 (Runnable 인터페이스를 상속받은 객체 전달)
		Thread x = new Thread(new KhClass());	//쓰레드 태어남  
												//new Thread(메소드하나만 들어있는 객체 = run() <- 하나만 들어있음)
												//new Runnable()의 자식 객체를 만들어서! => KhClass
		x.start(); // 쓰레드 일 시작
		
		//방법2 (객체 생성과 동시에 Override 진행)
		Thread y = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("22222222222");
			}
		});
		y.start();
		
		//방법3 (메소드를 바로 만들어서 전달) //functional 인터페이스 덕분에 가능.
		Thread z = new Thread( ()->{System.out.println("333333333");} ); // ((Runnable타입의:)객체)
							// 파라미터:() -> 실행내용:{~ex)출력문~)			 // ( 메소드 ) -> Runnable 하기 위해 넣는다
		z.start();
		
	}

}