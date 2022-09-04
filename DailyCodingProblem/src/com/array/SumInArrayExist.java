package com.array;

import java.util.HashMap;
import java.util.Map;

public class SumInArrayExist {

	/**
	 * Given a list of numbers and a number k, return whether any two numbers from
	 * the list add up to k.
	 * 
	 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is
	 * 17.
	 * 
	 * Bonus: Can you do this in one pass?
	 */

	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int arr[] = { 10, 15, 3, 7 };

		System.out.println(sumExist(arr, 17));

	}

	public static boolean sumExist(int arr[], int sum) {

		Map<Integer, Integer> arrElements = new HashMap<>();
		boolean exist = false;

		// construct map with all the element elements as key

		for (int i = 0; i < arr.length - 1; i++) {
			arrElements.put(i, i);
		}

		// find the if the sum exists in arry by just doing one time iteration (i.e. one pass).
		for (int i = 0; i < arr.length - 1; i++) {
			int findElement = sum - arr[i];

			if (arrElements.containsKey(findElement)) {
				return true;
			}

		}

		return exist;
	}

}
