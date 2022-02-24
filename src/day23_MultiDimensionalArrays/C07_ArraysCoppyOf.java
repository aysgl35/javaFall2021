package day23_MultiDimensionalArrays;

import java.util.Arrays;

public class C07_ArraysCoppyOf {

	public static void main(String[] args) {
		int arr1[] = { 3, 5, 7 };
		int arr2[] = { 2, 4, 6, 8 };
		int birlesikArray[] = birlestir(arr1, arr2);
		Arrays.sort(birlesikArray);
		System.out.println(Arrays.toString(birlesikArray));// [3, 5, 7, 2, 4, 6, 8]

	}

	private static int[] birlestir(int[] arr1, int[] arr2) {
		int birlsikArray[] = Arrays.copyOf(arr1, arr1.length + arr2.length);
		// [3,5,7,10,0,0,0,0]

		for (int i = 0; i < arr2.length; i++) {
			birlsikArray[i + arr1.length] = arr2[i];
		}

		return birlsikArray;

	}

}
