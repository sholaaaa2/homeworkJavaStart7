package com.gmail.kukaruka52;

public class Main {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		
		System.out.println(arrToString(arr));
	}
	public static String arrToString(int[] a) {
		StringBuilder sb = new StringBuilder("[");
		for (int i=0; i<a.length; i++) {
			if (i != a.length-1) {
				sb.append(a[i] + ",");
			} else {
				sb.append(a[i]);
			}
			
		}
		
		sb.append("]");
		String text = sb.toString();
		return text;
	}	

}
