package com.qa.mainPackage;

/**
 * @author SmilingGecko
 *
 */
public class HelloWorldMain {
	
	
	public String returnString(String str){
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HelloWorldMain thisTask = new HelloWorldMain();
		String hello = "Hello world!";
		System.out.println(thisTask.returnString(hello));

	}

}
