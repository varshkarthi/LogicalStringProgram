package org.string;

public class StringTask {

	public static void main(String[] args) {

		String s = "123AbcdBcds%&&";
		
		int u = 0;
		int l = 0;
		int n = 0;
		int c = 0;

		for (int i = 0; i < s.length(); i++) {

			char r = s.charAt(i);

			if (Character.isUpperCase(r))
				u++;

			else if (Character.isLowerCase(r))
				l++;

			else if (Character.isDigit(r))
				n++;

			else
				c++;
		}

		System.out.println("Uppercase Count = " + u);
		System.out.println("Lowercase Count = " + l);
		System.out.println("Numbers Count = " + n);
		System.out.println("SpecialChar Count = " + c);
	}
}
