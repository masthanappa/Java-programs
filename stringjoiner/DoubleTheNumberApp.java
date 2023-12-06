//write a program on double the value  of any number provided
package com.kn.stringjoiner;

import java.util.Scanner;
public class DoubleTheNumberApp {
public static void main(String[]args)
{
	int result=doubleTheNumber(15);
	System.out.println("Double the number="+result);
	
	
}
public static int doubleTheNumber(int num)
{	
	Scanner scan =new Scanner(System.in);
	System.out.println("enter a number");
	int a=scan.nextInt();
	int result=num*2;
	return result;
}
		
}

