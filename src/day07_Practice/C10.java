package day07_Practice;

import java.util.Scanner;

public class C10 {

	public static void main(String[] args) {
		 // Kullanýcýdan 5 sayý isteyiniz, bu sayýlardan en büyüðünü bularak yazdýrýnýz.

		
		int enbSayi=0;
		int count=0;
		while (count<5) {
			Scanner scan = new Scanner(System.in);
			System.out.println("lutfen  sayi giriniz");
			int sayi = scan.nextInt();
			if (sayi>enbSayi) {
				enbSayi=sayi;
				
			}
			count++;
		}
		
		System.out.println("enbuyuk sayi : " + enbSayi);
	}

}
