package com.kn.RecrsstionMethod;

import java.util.Scanner;

public class RecursstionMethodDemo {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		//take input user 
		System.out.println("Enter the input data");
		int input=scan.nextInt();
		
		//object Creation
		RecursstionMethod factorial=new RecursstionMethod();
		
		//method call
		int result=factorial.findFactorial(input);
		
		// print
		System.out.println("factorial of"+input+"is"+result);
	}

}
 