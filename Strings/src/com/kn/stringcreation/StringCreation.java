package com.kn.stringcreation;

public class StringCreation {
public static void main(String[] args) {
	
	String s1="Ram";
	System.out.println("s1= "+s1);
	
	String s2 = new String("Ram");
	System.out.println("s2 = "+s2);
	
	char[] crr = {'R','A','M'};
	String s3 = new String(crr);
	System.out.println("s3 = "+s3);
		
}
}
