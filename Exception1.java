package com.ericsson.exceptions;

import java.util.Scanner;

class Exception1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			
		System.out.println("Enter first number division :");
		int a = scanner.nextInt();
		System.out.println("Enter second number division :");
		int b = scanner.nextInt();

		System.out.println("division two numbers : " + (a / b));

		System.out.println("Remaining lines of code ");
		scanner.close();

	}
}