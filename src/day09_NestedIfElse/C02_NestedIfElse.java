package day09_NestedIfElse;

import java.util.Scanner;

public class C02_NestedIfElse {

	public static void main(String[] args) {
		/*
		 * Soru12)Kullan�c�dan 4 basamakli bir sayi girmesini isteyin. 
		 * Girdi�i sayi 5�e  b�l�n�yorsa son rakam�n� kontrol edin. Son rakam� 0 ise ekrana �5�e b�l�nen  �ift say�� yazd�r�n. 
		 * Son rakam� 0 de�il ise �5�e b�l�nen tek say�� yazd�r�n.  Girdi�i password 5�e
		 *  b�l�nm�yorsa ekrana �Tekrar deneyin� yazd�r�n.
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 4 basamakl� bir sayi giriniz");
		int sayi=scan.nextInt();
		if (sayi<1000 || sayi>9999) {
			System.out.println("lutfen 4 basamakl� pozitif bir sayi giriniz");
			
		} else {//4 basamakl� say�lar� yakalayacak
			if (sayi%5==0) {//5 e tam bolunenler
				if (sayi%10==0) {//son rakam 0 demek
					System.out.println("5 e tam bolunen cift sayi");
				} else {// son rakam 5
					System.out.println("5 e tam bolunen tek sayi");
				}
				
			} else {//5 e tam bolunmeyenler
				System.out.println("lutfen tekrar deneyiniz");
			}

		}
	}

}
