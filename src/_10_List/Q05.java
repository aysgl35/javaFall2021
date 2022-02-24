package _10_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        // Kullanýcýdan alacagýnýz 6 elemanlý bir dizinin
        // sadece tek elemanlarýný ayrý diziye bir metodda atayarak
        // main de yazdýrýnýz.
    	
    Scanner scan = new Scanner (System.in);
    int arr []=new int [6];
    for (int i = 0; i < arr.length; i++) {
		System.out.println(i+ " .sayiyi giriniz");
		arr[i]=scan.nextInt();
		
	}
    tekEleman (arr);

    }

	private static ArrayList<Integer> tekEleman(int[] arr) {
		ArrayList <Integer> list= new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==1) {
				list.add(arr[i]);
			
			}
		}
		System.out.println(list);
		return list;
	}


}
