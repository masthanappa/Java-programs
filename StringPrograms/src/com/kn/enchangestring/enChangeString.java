package com.kn.enchangestring;

import java.util.Scanner;

public class enChangeString {

	public String toPrintenCharge(String inputString,int n) {
	while(n>26)
	{
		n=n-26;
	}
	char[] arr= inputString.toCharArray();
	
	for(int i=0; i<arr.length;i++) {
	
		if (arr[i]>=65 && arr[i]<=90||(crr[i]>=97)) {
			arr[i]=(char)(arr[i]+n);
		}else if (arr[i]>90) {
			arr[i]=(char)(arr[i]+n);
			
		}
	}

	}  
