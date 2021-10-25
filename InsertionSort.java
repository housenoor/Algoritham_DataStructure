package com.Algorithmprgms;

public class InsertionSort {
	/*
	 * Declaring Main Method To Sort Array Into InsertionSort
	 */
	public static void main(String[] args) {
		String[] myArray = { "Sri", "Sami", "Udayi", "Hasini", "Srinaath" }; // Declaring String as myArray
		int a = myArray.length;// myArray.length points To g
		String sortedArray[] = InsertionSort(myArray, myArray.length); // Calling Insertion Sort Method And Stored In
																		// StoredArray
		System.out.println("After Sorting MyArray is : ");
		// For Loop To Print Stored Array
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.print(sortedArray[i] + ",");
		}
	}

	/*
	 * Declaring InsertionSort Method To Sorting Elements Into InsertionSort
	 */
	public static String[] InsertionSort(String myArray[], int g) {
		String temp = "";// Defining Temp As Empty String
		for (int i = 0; i < g; i++) {// For Loop To Sorting Elements
			for (int j = i + 1; j < g; j++) {
				// Checking If Condition If Both Are Equal MyArray Stored In Temp
				if (myArray[i].compareToIgnoreCase(myArray[j]) > 0) {
					// Swapping Of MyArray[i] And MyArray[j]
					temp = myArray[i];
					myArray[i] = myArray[j];
					myArray[j] = temp;
				}
			}
		}
		return myArray;// Returning MyArray
	}
}