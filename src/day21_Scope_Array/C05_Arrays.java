package day21_Scope_Array;

import java.util.Arrays;

public class C05_Arrays {

	public static void main(String[] args) {
		//Soru 1: Verilen 3 elemanli bir array�in tum elemanlarini bir soldaki konuma tasiyacak bir program yazin. 
		//Ornek; array [1,2, 3] ise output [2, 3, 1] olacak.
	
		int arr[]= {1,2,3};
		int kova=arr[0];
		for (int i = 0; i < arr.length-1; i++) {
			arr[i]=arr[i+1];//arr[0]=2 demek bu �ekilde devam edecek
		}
		
	arr[arr.length-1]=kova;
	
	System.out.println(Arrays.toString(arr));
	
	
	}

}