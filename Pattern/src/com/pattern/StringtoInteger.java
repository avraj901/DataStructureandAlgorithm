package com.pattern;

public class StringtoInteger {

	public static void main(String[] args) {
		
		String[] x = {"A", "B", "C","D","E"};
		nxt(x);
		for(String s : x) {
			System.out.println(s + " ");
		}
		
	}
	static void nxt(Object o) {
		String[] y = (String[] )o;
		for(int i=5, j=0; i>0;i--,j++) {
			y[j] = Integer.toString(i);
		}
		
	}

}
