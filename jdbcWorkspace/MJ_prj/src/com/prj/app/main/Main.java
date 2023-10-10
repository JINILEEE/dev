package com.prj.app.main;

import com.prj.app.member.controller.MemberController;

public class Main {

	public static void main(String[] args) {

		System.out.println("======= 다마고치 키우기 =======");

		Background bg = new Background();
		bg.art();
		
		MemberController memberController = new MemberController();
		
		while(true) {
			memberController.selectMenu();
		}
		
	}//main

}//class
