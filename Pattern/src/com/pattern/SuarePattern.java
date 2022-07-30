package com.pattern;

import java.util.Scanner;

public class SuarePattern {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = scanner.nextInt();
		System.out.println("number :: "+number);
		for (int r=0; r < number ; r++) {
			for(int c=0; c< number; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
