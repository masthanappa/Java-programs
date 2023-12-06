package com.kn.bracketStrings;

public class BraketStrings {
public static void main(String[] args) {
	String input="({[]})";
	isBlancedString(input);
}

private static void isBlancedString(String input) {
	// StringBuffer sb1=new SgtringBuffer();
	char[]c= input .toCharArray();
	int parentheses=0;
	int curly=0;
	int square=0;
	for(int i=0;i<c.length;i++) {
		if(c[i]=='(') {
			parentheses++;
		}else if(c[i]=='{') {
			curly++;
		}else if (c[i]=='[') {
			square++;
		}else if (c[i]==']') {
			square--;
		}else if (c[i]=='}') {
			curly--;
		}else if(c[i]==')') {
			parentheses--;
		}

}
if (parentheses==0&&curly==0&&square==0) {
	System.out.println("They are balenced string");
}else {
	System.out.println("They are you unbalenced string");
	
}
}
}
