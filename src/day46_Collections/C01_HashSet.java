package day46_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_HashSet {

	public static void main(String[] args) {
//Verilen bir Array'deki tekrar eden sayilari silip
//unique degerlerden olusan bir array olusturun

		
	int arr[]= {3,4,6,4,2,4,6,8,6,5,3,1,2,4,6,7};
	Set<Integer> uniqueSet = new HashSet<>();
	for (Integer w : arr) {
	uniqueSet.add(w);
	}
	System.out.println(uniqueSet);
	
	Object[]tekrarsizArr=uniqueSet.toArray();
	System.out.println(Arrays.toString(tekrarsizArr));
	
	System.out.println("********2.yol for each le*********");
	
	int[] arr1= new int[uniqueSet.size()];
	int index=0;
	for (int w : uniqueSet) {
		
	arr1[index]=w;
	index++;	
	
		
		
	}
	System.out.println(Arrays.toString(arr1));
	
	}

}
