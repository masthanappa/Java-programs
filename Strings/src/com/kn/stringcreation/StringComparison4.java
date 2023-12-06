package com.kn.stringcreation;

public class StringComparison4 {

	public static void main(String[] args) {
		String s1 = "Ram";
		String s2 = "Sita";
		String s3 = s1 + s2;
		String s4 = s1 + s2;

		//String Comparison 
		if(s3==s4) {
			System.out.println("Refernce are point same object");
		}else {
			System.out.println("Refernce are point to differnt object");
		}
		
		//String data Comparison 
		if(s3.equals(s4)) {
			System.out.println("String object data is equla ");
		}else {
			System.out.println("String object data is unequla ");

		}
	}

	}

	


