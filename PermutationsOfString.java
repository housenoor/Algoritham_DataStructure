package com.Algorithmprgms;

import java.util.ArrayList;
import java.util.List;

// Program to find Permutations of a string
// Using Iterative method and Recursion method

public class PermutationsOfString {
	// Declaring Static ArrayList
	static List<String> recurPermutations = new ArrayList<>();

	/*
	 * Declaring Main Method
	 */
	public static void main(String[] args) {
		String s = "ABC";// Declaring String Variable
		recursiveApproach(s.toCharArray(), 0);
		System.out.println("Result : " + recurPermutations); // Printing The RecurPermutations
	}

	// Recursive Function To Generate All Permutations Of a String

	private static void recursiveApproach(char[] ch, int currentIndex) {
		// If Condition To Check CurrentIndex Is Equal To ch.Length -1
		if (currentIndex == ch.length - 1) {
			recurPermutations.add(String.valueOf(ch));// Adding String Value Of Character To String
		}
		// For Loop To Traverse The Strings To Swap And Recursively
		for (int i = currentIndex; i < ch.length; i++) {
			swap(ch, currentIndex, i);// Swap Of ch,currentIndex,i
			recursiveApproach(ch, currentIndex + 1);
			swap(ch, currentIndex, i);//// Swap Of ch,currentIndex,i
		} // End Of For Loop
	}

	// Method To Swapping The Strings

	private static void swap(char[] ch, int i, int j) {
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
	}
}