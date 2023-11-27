package org.string;

import java.util.Iterator;

public class PolindromeString {

	public static void main(String[] args) {
		
		String s = "malayalam";
		String r = "";
		
		for (int i = s.length()-1; i >=0; i--) {
			r = r + s.charAt(i);			
		}
		if (s.equals(r)) {
			
			System.out.println("Polindrome String");
			
		} else {
			
			System.out.println("Not a Polindrome String");
		}

	}

}
