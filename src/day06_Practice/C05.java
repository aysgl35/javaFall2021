package day06_Practice;

import java.util.Iterator;
import java.util.Scanner;

public class C05 {

	public static void main(String[] args) {
		// Kullan�c�dan 5 adet say� isteyiniz
        // Bu say�lardan 5 ile 10 aras�ndakiler hari�,
		//di�erlerinin toplam�n� bulunuz.
        // bu soruyu continue kullanarak ��z�n�z.
		
		Scanner scan = new Scanner (System.in);
		int toplam=0;
		for (int i = 1; i <6; i++) {
		System.out.println("sayi "+i+" giriniz : ");
			int sayi=scan.nextInt();
			if (sayi>5 && sayi<10) {
		System.out.println("girilen sayi 5 ile 10 arasi"
				+ "oldugundan isleme al�nmad�");
			continue;//bekleme devam et komutudur... yok saymak pas ge� gibi bir sey	
			//continue olmadan calisinca 5 ile 10 arasindaki degerleri de topluyor
			}
			toplam+=sayi;
		}
		System.out.println("girdiginiz sayilarin toplam�: "+toplam);
	}

}
