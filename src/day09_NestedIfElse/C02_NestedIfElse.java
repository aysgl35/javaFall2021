package day09_NestedIfElse;

import java.util.Scanner;

public class C02_NestedIfElse {

	public static void main(String[] args) {
		/*
		 * Soru12)Kullanýcýdan 4 basamakli bir sayi girmesini isteyin. 
		 * Girdiði sayi 5’e  bölünüyorsa son rakamýný kontrol edin. Son rakamý 0 ise ekrana “5’e bölünen  çift sayý” yazdýrýn. 
		 * Son rakamý 0 deðil ise “5’e bölünen tek sayý” yazdýrýn.  Girdiði password 5’e
		 *  bölünmüyorsa ekrana “Tekrar deneyin” yazdýrýn.
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 4 basamaklý bir sayi giriniz");
		int sayi=scan.nextInt();
		if (sayi<1000 || sayi>9999) {
			System.out.println("lutfen 4 basamaklý pozitif bir sayi giriniz");
			
		} else {//4 basamaklý sayýlarý yakalayacak
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
