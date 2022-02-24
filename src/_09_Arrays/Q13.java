package _09_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		// Kullanicidan aldigimiz 8 elemanli arrayin icinde 
    	// kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
		Scanner scan = new Scanner (System.in);
		System.out.println("lutfen 8 adet sayi giriniz");
		int sayi=0;
		int arr[]=new int [8];
		
		int count=0;
		
		int count2=0;
		for (int i = 0; i < 8; i++) {
		System.out.println(i+1 + ". sayiyi giriniz");
			arr[i] =scan.nextInt();
			if (arr[i]%3==0) {
				count++;
				
			}
			
			
						
						
					
			}
		int arr1[]=new int [count];	
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%3==0) {
				arr1 [count2]=arr[i];
				count2++;
				
			}
			
	}	
		
		System.out.println(Arrays.toString(arr));
		System.out.println(count);
		System.out.println(Arrays.toString(arr1));
	}

}
