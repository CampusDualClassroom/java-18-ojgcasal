package com.campusdual.classroom;

import com.campusdual.util.Utils;
public class Exercise18 {

	public static void main(String[] args) {

		int size = Utils.integer("Ingrese la cantidad de números naturales que desea en el array: ");

		int[] array = createAndInitializeArray(size);

		showInlineArray(array);
	}

	public static int[] createAndInitializeArray(int n) {
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = i + 1;
		}
		return array;
	}

	public static void showInlineArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i < array.length - 1) {
				System.out.print(" ");
			}
		}
	}
}
