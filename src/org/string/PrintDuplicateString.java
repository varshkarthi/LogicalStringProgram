package org.string;

public class PrintDuplicateString {

	public static void main(String[] args) {

		String s = "malayalam";
		String o = "";

		for (int i = 0; i < s.length(); i++) {

			if (o.contains(String.valueOf(s.charAt(i)))) {

				System.out.print(s.charAt(i));

			} else {

				o = o + s.charAt(i);
			}
		}

	}

}
