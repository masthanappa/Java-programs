package com.kn.stringcreation;

public class StringComparison3 {

	public static void main(String[] args) {
		String s1 = "Ram";
		String s2 = "Sita";
		String s3 = "Ram"+"Sita";
		String s4 = "Ram"+"Sita";

		if(s3==s4) {
			System.out.println("Refernce are point same object");
		}else {
			System.out.println("Refernce are point to differnt object");
		}
		if(s3.equals(s4)) {
			System.out.println("String object data is equla ");
		}else {
			System.out.println("String object data is unequla ");

		}
	}

	}


