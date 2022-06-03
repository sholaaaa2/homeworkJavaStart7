package com.gmail.kukaruka52;

public class Main {

	public static void main(String[] args) {
		int a = 117;
		int b = 17;
		
		System.out.println("a="+a+", b="+b+", Hem num = "+getHem(a, b));
	}
	public static int getHem(int a, int b) {
		int count = 0;
		int c = a^b;
		
		for (; c != 0;) {
			if ((c&1)>0) {
				count++;
			}
			c=c>>1;
		}
		
		return count;
	}
}
