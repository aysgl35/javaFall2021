package day23_MultiDimensionalArrays;

import java.util.Arrays;

public class C02_MDArrays {

	public static void main(String[] args) {
		//Multi Dimensional Arrayler ic ice konulmuþ arrayler demektir
		//Arayy olusturmak icin iki yöntemimiz vardý
		// 1.yontem once declare edip sonra deger atama
		
		int arr[][]=new int [3][2];
		//outer arrayi 3 elemanli
		//her bir inner array ise 2 elamanli olan MDArray olusturur
		//Bu yöntemle olusturdugumuzda inner array lerin hepsi ayni boyutta olmalidir

		System.out.println(Arrays.toString(arr));
		//direk outer arrayi yazdirmak istedigimizde
		//icindeki elemanlar non-primitive oldugundan
		//referanslari yazdýrýlýr 
		//[[I@5ccd43c2, [I@4aa8f0b4, [I@7960847b]
		System.out.println(Arrays.toString(arr[1]));//[0, 0]
		System.out.println(Arrays.toString(arr[2]));//[0, 0]
		System.out.println(Arrays.deepToString(arr));//[[0, 0], [0, 0], [0, 0]]
		arr[0][1]=5;
		arr[1][0]=2;
		arr[2][1]=3;
		System.out.println(Arrays.deepToString(arr));//[[0, 5], [2, 0], [0, 3]]
		//Array olusturmak icin iki yöntemimiz vardi
		//2.yontem hem declare edip hem de deger atama
		
		int arr2[][]= { {0},{1,2,3},{6,7,8,9} };
		
		System.out.println(Arrays.deepToString(arr2));//[[0], [1, 2, 3], [6, 7, 8, 9]]
		
		System.out.println(Arrays.toString(arr2[1]));//[1, 2, 3]
		
		System.out.println(arr2[2][1]);//7
		
		
	}

}
