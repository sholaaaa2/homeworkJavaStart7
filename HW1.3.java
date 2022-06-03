package com.gmail.kukaruka52;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String bin;
		int res = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число в бинарной форме");
		bin = sc.nextLine();

		StringBuilder sb = new StringBuilder();
		sb.append(bin);
		sb.reverse();

		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == '1') {
				res += Math.pow(2, i);
			}
		}

		System.out.println(bin + " => "+res);

	}

}