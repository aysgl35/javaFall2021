package day07_Practice;

import java.util.Scanner;

public class C10 {

	public static void main(String[] args) {
		 // Kullan�c�dan 5 say� isteyiniz, bu say�lardan en b�y���n� bularak yazd�r�n�z.

		
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
