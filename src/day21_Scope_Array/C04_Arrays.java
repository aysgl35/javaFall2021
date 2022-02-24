package day21_Scope_Array;

import java.util.Arrays;
import java.util.Iterator;

public class C04_Arrays {

	public static void main(String[] args) {
	int arr[]= {2,4,5,78,89};
	//tum elementlerini yazdirabiliriz
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+ " ");// 2 4 5 78 89 
		
	}
	System.out.println();
	System.out.println("Arrayi yazdýrmanýn kýsa yolu: Arrays.toString(arr)");
 System.out.println(Arrays.toString(arr));// [2, 4, 5, 78, 89]
	}

}
