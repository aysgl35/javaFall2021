package day23_MultiDimensionalArrays;

import java.util.Arrays;

public class C06_Arrays {

	public static void main(String[] args) {
  //Verilen iki array i birlestiren
	//ve sonucu birlesikArray isminde bir arraye kaydeden
	//bir method olusturunuz
	
		int arr1[]= {3,5,7};
		int arr2[]= {2,4,6,8};
	int birlesikArray[]=birlestir(arr1,arr2);
	System.out.println(birlestir(arr1,arr2));//[3, 5, 7, 2, 4, 6, 8]
	
	}

	private static int[] birlestir(int[] arr1, int[] arr2) {
		int birlsikArray[]=new int[arr1.length+arr2.length];
		//scope u farklı oldugu için ayni ismi kullanabiliriz
		//ama ben bir harf eksilttim 
		for (int i = 0; i < arr1.length; i++) {
			birlsikArray[i]=arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			birlsikArray[i+arr1.length]=arr2[i];
		}
		
		
		return birlsikArray;
	}

}
