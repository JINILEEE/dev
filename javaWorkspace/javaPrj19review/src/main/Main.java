package main;

import practice.MethodTest;
//import practice.ArrayTest;
//import practice.ControlTest;
//import practice.OperatorTest;
//import practice.VarTest;

public class Main {

	public static void main(String[] args) {
		
//		System.out.println("복습");
//		
//		VarTest vt = new VarTest();  //VarTest에 빨간줄 => Ctrl+1 해서 import하면 됨
//		vt.test();
//		
//		OperatorTest ot = new OperatorTest();
//		ot.test();
		
//		ControlTest ct = new ControlTest();
//		ct.test();
		
//		ArrayTest at = new ArrayTest();
//		at.test();
		
		MethodTest mt = new MethodTest();
		 int x = mt.test04(10, 20);
		 System.out.println(x);
	}

}
