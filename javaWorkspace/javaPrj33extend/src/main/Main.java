package main;

import mob.Pairi;
import mob.Pikachu;
//import mob.Pokemon;
import mob.Turtle;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("=====상속=====");
		
//		Pokemon p = new Pokemon();
//		p.setName("피카츄");  //글자 넣기 위해 setName이라는 메소드를 활용한다.
//		p.setHp(100);
//		p.setAtk(30);
//		p.setDef(10);
		
//		System.out.println(p.getName());
//		System.out.println(p.getHp());
//		System.out.println(p.getAtk());
//		System.out.println(p.getDef());
		
//		System.out.println(p.toString());
		
		//===============================================
		
		Pikachu pikachu = new Pikachu();
		System.out.println(pikachu.toString());
		
		Pairi pairi = new Pairi();
		System.out.println(pairi.toString());
		
		Turtle turtle = new Turtle();
		System.out.println(turtle.toString());
	}

}//Class
