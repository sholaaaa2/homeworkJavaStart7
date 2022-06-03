package com.gmail.kukaruka52;

public class Main {

	public static void main(String[] args) {
		String one = "11111111111";
		String two = "121212121212";
		String three = "121121121121";
		String four = "1211121112111211";
		String five = "1245124512451245";

		System.out.println("In sequence '" + one + "' we repeat this number => " + minNumOfSeq(one));
		System.out.println("In sequence '" + two + "' we repeat this number => " + minNumOfSeq(two));
		System.out.println("In sequence '" + three + "' we repeat this number => " + minNumOfSeq(three));
		System.out.println("In sequence '" + four + "' we repeat this number => " + minNumOfSeq(four));
		System.out.println("In sequence '" + five + "' we repeat this number => " + minNumOfSeq(five));
	}

	public static String minNumOfSeq(String str) {
		String min = "";
		boolean stop = false;

		for (int i = 1; i < 100; i++) {
			String s = str.substring(0, i);
			int c = 0;
			for (int j = 0; j < str.length() / s.length(); j = j + i) {
				if (s.equals(str.substring(j, j + i))) {

					min = s;
					stop = true;

				} else {
					c--;
					stop = false;
				}

			}
			if (stop && c == 0) {
				break;
			}

		}
		return min;

	}

}
