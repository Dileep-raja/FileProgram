package com.fileapp.model;

import java.util.Arrays;

/**
 * @author dialla 
 * 
 * program is for a given array you have to split the array into
 *         two equal parts having same sum.
 */
public class ArrayaProgram {

	public static void main(String[] args) {

		int[] intArray = { 5, 1, 2, 3, 4, 5 };
		int[] leftArray = null;
		int[] rightArray = null;
		int length = intArray.length;

		Arrays.sort(intArray);
		leftArray = new int[(length / 2) + 1];
		rightArray = new int[length - (leftArray.length)];

		for (int i = 0; i < length; i++) {

			if (i < leftArray.length) {
				leftArray[i] = intArray[i];

			} else {
				for (int j = 0; j < rightArray.length; j++) {
					rightArray[j] = intArray[i];

				}
			}
		}

		System.out.println("Left Array:");
		Arrays.stream(leftArray).forEach(e1 -> System.out.print(e1 + " "));

		System.out.println();
		System.out.println("Right Array:");
		Arrays.stream(rightArray).forEach(e2 -> System.out.print(e2 + " "));

	}
}
