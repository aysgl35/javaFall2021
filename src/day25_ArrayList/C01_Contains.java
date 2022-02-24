package day25_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C01_Contains {

	public static void main(String[] args) {
	//verilen bir array'de tekrar eden elementleri 
	//sadece birer tane yazarak unigue elementlerden olusan
	//bir array haline getirelim
		int arr []= {2,3,4,5,6,7,8,7,6,9,3,4,5,7,4,3,6};
		//2,3,4,5,6,7,8,9 sonuc bu þekilde olacak
		List<Integer>unique = new ArrayList <>(); 
		for (int i = 0; i < arr.length; i++) {
			if (!unique.contains(arr[i])) {
				unique.add(arr[i]);
				
			}
				
			}
			System.out.println(unique);
			int uniqueArray[]=new int [unique.size()];
			for (int i = 0; i < uniqueArray.length; i++) {
				uniqueArray[i]=unique.get(i);
			}
			System.out.println(Arrays.toString(uniqueArray));
		}
		
	

	}


