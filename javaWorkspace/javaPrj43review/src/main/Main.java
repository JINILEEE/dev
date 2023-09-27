package main;

import emp.CounterEmp;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("===== 메가커피 =====");
		
		//직원 준비
		CounterEmp counterEmp = new CounterEmp();
		
		//카운터 직원 일 시작
		counterEmp.work();
		
	}

}
