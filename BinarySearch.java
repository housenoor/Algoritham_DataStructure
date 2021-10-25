package com.Algorithmprgms;

public class BinarySearch {
	public static void main(String[] args) {
		String[] word = { "Binary", "search", "program", "practice" };
		String search = "search";
		int result = binarySearch(word, search);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element present at index " + result);

	}

	/* This Method is used to search using Binary search */
	public static int binarySearch(String[] word, String search) {
		int first = 0, last = word.length - 1;
		while (first <= last) {
			int mid = (first + last ) / 2;
			int result = search.compareTo(word[mid]);
			if (result == 0)
				return mid;
			if (result > 0)
				first = mid + 1;
			else
				last = mid - 1;
		}
		return -1;
	}

}