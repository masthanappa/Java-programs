package com.kn.RecrsstionMethod;

import java.util.Scanner;

public class RecursstionMethod {
public int findFactorial (int input) {
	if(input==1) {
		return 1;
	}else {
		return input*findFactorial(input-1);
	}
	
	
	
}
}