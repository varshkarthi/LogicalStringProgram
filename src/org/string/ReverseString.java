package org.string;

import java.util.Iterator;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "Application";
		String r = "";
		
		for (int i = s.length()-1; i >=0; i--) {
			r = r + s.charAt(i);			
		}
		
		System.out.println(r);

	}

}
