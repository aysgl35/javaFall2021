package day23_MultiDimensionalArrays;

import java.util.Arrays;

public class C01_Array {

	public static void main(String[] args) {
		// Verilen bir array'den istenen degere sahip elementleri silip
				// kalani yeni bir array olarak kaydedin
				// ve sonra yeni array'i yazdirin	
	int arr[]= {3,4,5,6,3,5,8,3,4,9};
	int silinecekEleman=5;
	System.out.println(Arrays.toString(arr));
	//arrayde yeni eleman ekleyemeyiz veya var olan elamanlari silemeyiz
	//cunku arrayin declare edilen uzunlugu DEGÝZMEZ
	
	//Bu soruda istenen elementi sildilgimizde geriye kac element kaliyor bulmamiz lazim
	 //silinecek sayi adedini bulalim
	int sayac=0;
	for (int i = 0; i < arr.length; i++) {
		if (arr[i]==silinecekEleman) {
			sayac++;
		}
	}
		System.out.println("silinecek eleman sayisi:" +sayac);
		int yeniArrayUzunluk=arr.length-sayac;
		//artik yeni array i oluþturabiliriz
		
		int yeniArr[]=new int[yeniArrayUzunluk];
		
		//simdi eski array deki elemanlari birer birer alip
		//silinecek elemana esit olmayanlarý yeni arraye atamaliyiz
		int j=0;
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]!=silinecekEleman) {
				yeniArr[j]=arr[i];
				j++;
			}	
			
			
			
		}
		
		System.out.println(Arrays.toString(yeniArr));
		
	}

}
