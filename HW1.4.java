package com.gmail.kukaruka52;

public class Main {

	public static void main(String[] args) {
		for (int i = 2; i < 12; i++) {
			String text = String.format("pi = "+"%."+i+"f", Math.PI);
			System.out.println(text);
		}
	}
}
