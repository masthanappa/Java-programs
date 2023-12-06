package com.kn.reversestring;

import java.util.Scanner;

public class ReverseString {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter the String Data");
	String inputstring=scan.nextLine();
	
	ReverseString reverseString=new ReverseString();
	
	String outputString=reverseString.reverseString(inputString);
	System.out.println("Reversed String Data="+outputString);
}
}
