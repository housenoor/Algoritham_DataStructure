package com.Algorithmprgms;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int upper, lower;
		// Taking limit from the user
		System.out.println("Enter the lower bound");
		lower = sc.nextInt();
		System.out.println("Enter the upper bound");
		upper = sc.nextInt();
		System.out.println("Prime numbers between " + lower + " and " + "upper  " + upper + "is : ");
		isprime(lower, upper);
		sc.close();
	}

	// Purpose : Method to find prime numbers between given range
	// lower for lower limit
	// upper for upper limit

	private static void isprime(int lower, int upper) {
		int i, flag, j;
		for (i = lower; i <= upper; i++) {
			if (i == 1 || i == 0)
				continue;
			flag = 1;
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = 0;
					break;
				}
			}
			if (flag == 1)
				System.out.println(i);
		}

	}
}