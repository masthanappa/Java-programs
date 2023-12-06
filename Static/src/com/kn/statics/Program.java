package com.kn.statics;

public class Program {

	
	static int x,y;
	
	static {
		System.out.println("Static Block");
		x=10;
		y=20;
		
		System.out.println("---------------->>>>>>");
		
	}
	public static void disp1() {
		System.out.println("Static Method");
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("---------------->>>>>>");
	}
	int a,b;
	{
		System.out.println("Instent Block");
		a=11;
		b=22;
		x=100;
		y=200;
		System.out.println("---------------->>>>>>");
	}
	public void disp2() {
		System.out.println("instence Method");
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		System.out.println("---------------->>>>>>");
		
	}
	public Program() {
		System.out.println("constractor");
	}
	
}
