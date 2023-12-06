package com.kn.stringcreation;

public class StringMethods2 {
public static void main(String[] args) {
	String s1 = "Raja Ram Mohan Roy";
	System.out.println("To convert data in upper case");
	System.out.println(s1.toUpperCase());
	System.out.println("To convert data in Lower case");
	System.out.println(s1.toLowerCase());
	System.out.println("Return the character at specifide");
	System.out.println(s1.charAt(6));
	System.out.println("Return index value for first occurance of specifide character");
	System.out.println(s1.indexOf('a'));
	System.out.println("Return index value for last occurance of specifide character");
	System.out.println(s1.lastIndexOf('a'));
	System.out.println("Return Sgtring from specifide index");
	System.out.println(s1.substring(5));
	System.out.println("Return String Starting from begining index file ending index");
	System.out.println(s1.substring(9,14));
	System.out.println("Return true if specifide string found else false");
	System.out.println(s1.concat("Ram"));
	System.out.println("Return true if string Starts with Specifide String");
	System.out.println(s1.startsWith("Ra"));
	System.out.println("Return true if string Ends with Specifide String");
	System.out.println(s1.endsWith("oy"));
	System.out.println("Return character usig spicifide char");
	char[]crr=s1.toCharArray();
	System.out.println(s1.length());
	for(int i=crr.length-1;i>=0;i--){
		System.out.println(crr[i]);
	}
	System.out.println("");
	System.out.println("Return Array of string sulited using specifide regex (delimiter)");
	String[]Srr=s1.split(" ");
	for(int i=crr.length-1;i>=0;i++){
		System.out.println(i+" = "+Srr[i]);
	}
	System.out.println("");
	for	(int i=crr.length-1;i>=0;i--){ 
		System.out.println(Srr[i]+" ");
	}
	System.out.println(" ");
	System.out.println("Returen string removing additional space ");
	System.out.println(s1.trim());//removing additional spaceses leading and trillng specese
	System.out.println("Return String replacing the substring");
	System.out.println(s1.replace("Mo", "pa"));
	System.out.println("Return String replacing the substring");
	System.out.println(s1.replaceAll("Mohan", "Prabhas"));
	}
}

