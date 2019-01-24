package com.fileapp.api;

import java.util.ArrayList;
import java.util.List;

public class ArrayReverseApp {

	public static void main(String[] args) {
		/*
		 * int[] array = {126,6}; List<Integer> killSix = new ArrayList<>(); for (int i
		 * = 0; i < array.length - 1; i++) { if (array[i] == 6) { continue; }
		 * killSix.add(array[i]); } System.out.println(killSix);
		 */
		int[] t = { 4, 5, 7, 11, 9, 13, 8, 12 };
		int d = 20;

		for (int i = 0; i < t.length - 1; i++) {
			for (int j = i + 1; j < t.length; j++) {
				if ((t[i] + t[j]) == d) {
					System.out.println(t[i] + ", " + t[j]);
				}
			}

		}
	}
}