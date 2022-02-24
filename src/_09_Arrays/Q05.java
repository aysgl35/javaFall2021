package _09_Arrays;

import java.util.Arrays;

public class Q05 {

	public static void main(String[] args) {
		/*
		 * write a java program that calculates the average value of array elements
		 * Print elements that are greater than avarage
		 * (dizi elemanlarinin ortalama degerini hesaplayan ve
		 * ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
		 * input[]= {1,2,3,4,5,6,7} 
		 * Output : 4
		 */
		int input[]= {1,2,3,4,5,6,7};
		int toplam=0;
		int size =input.length;
		int ortalama=0;
		
		for (int i = 0; i <= input.length; i++) {
			toplam+=i;
			
			
			
		}
		
		System.out.println(ortalama=toplam/size);
		}
		
	}


