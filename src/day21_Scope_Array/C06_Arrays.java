package day21_Scope_Array;

import java.util.Arrays;

public class C06_Arrays {

	public static void main(String[] args) {
		//Soru 2: Verilen bir array’in tum elemanlarini toplayan bir program yazalim.
		int arr[]= {1,5,3,2,4};
		int toplam=0;
		for (int i = 0; i < arr.length; i++) {
			toplam+=arr[i];
		}
		System.out.println("elementlerin toplamý: "+toplam);
		//array in tum elemanlarini once kucukten buyuge sonra buyukten kucuðe yazdýrýn
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	//buyukten kucuge yazdirmak icin 
	//ya for loop ile elemanlari ters sirada yazdýrýrýz
		for (int i = arr.length-1; i >=0 ; i--) {
			System.out.print(arr[i]+" ");
			
		}
	//array yapmak isterseniz ayni uzunlukta bir array oluþturup
	//elemanlari ters sirada yeni arraye tasiyabilirsiniz
		
		System.out.println("  ");
	int tersArray[]=new int[arr.length];
	for (int i = 0; i < tersArray.length; i++) {
		tersArray[i]=arr[arr.length-1-i];
		
	}
	System.out.print(Arrays.toString(tersArray));
	}

}
