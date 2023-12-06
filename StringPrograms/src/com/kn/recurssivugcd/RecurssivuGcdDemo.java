package com.kn.recurssivugcd;

import java.util.Scanner;


public class RecurssivuGcdDemo {

	public static void main(String[] args) {
			
			Scanner scan=new Scanner(System.in);
			
			//take input user 
			System.out.println("Enter the input data");
			int input=scan.nextInt();
			
			//object Creation
			RecursstivuGcd factorial=new RecurssivuGcd();
			
			//method call
			int result=factorial.findGcd();
			
			// print
			System.out.println("factorial of"+n1,n2+"is"+result);

	}

}
