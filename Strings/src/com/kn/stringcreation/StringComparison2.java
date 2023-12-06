package com.kn.stringcreation;

public class StringComparison2 {
	public static void main(String[] args) {
		String s1 =new String ("Sita");
		String s2 = new String ("Sita");

		if(s1==s2) {
			System.out.println("Refernce are point same object");
		}else {
			System.out.println("Refernce are point to differnt object");
		}
		if(s1.equals(s2)) {
			System.out.println("String object data is equla ");
		}else {
			System.out.println("String object data is unequla ");

		}
	}
}
