package com.kn.stringcreation;

public class StringBufferDemo {

	public static void main(String[] args) {
StringBuffer stringBuffer = new StringBuffer("Ram");
System.out.println("Data ="+stringBuffer);
System.out.println("length ="+stringBuffer.length());
System.out.println("Capacity ="+stringBuffer.capacity());

System.out.println("******************************");
System.out.println();

stringBuffer.append("sita");
stringBuffer.append("sita");
stringBuffer.append("sita");
stringBuffer.append("sita");
System.out.println(' ');
System.out.println("Data ="+stringBuffer);
System.out.println("length ="+stringBuffer.length());
System.out.println("Capacity ="+stringBuffer.capacity());


	}

}
