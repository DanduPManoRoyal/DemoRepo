package com.example;


public class Palindrome {
	
	public static void main(String[] args) {
		
		String input="level";
		String output="";
		char ch;
		
		for(int i=0;i<input.length();i++) {
			ch=input.charAt(i);
			output=ch+output;
		}
		if(input.equals(output)) {
			System.out.println("it is a palindrom");
		}
		else {
			System.out.println("not palindrome");
		}
	}
	
	
	}
	

	  	
	
	
	
	

