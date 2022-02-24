package day06_Practice;

import java.util.Iterator;
import java.util.Scanner;

public class C05 {

	public static void main(String[] args) {
		// Kullanýcýdan 5 adet sayý isteyiniz
        // Bu sayýlardan 5 ile 10 arasýndakiler hariç,
		//diðerlerinin toplamýný bulunuz.
        // bu soruyu continue kullanarak çözünüz.
		
		Scanner scan = new Scanner (System.in);
		int toplam=0;
		for (int i = 1; i <6; i++) {
		System.out.println("sayi "+i+" giriniz : ");
			int sayi=scan.nextInt();
			if (sayi>5 && sayi<10) {
		System.out.println("girilen sayi 5 ile 10 arasi"
				+ "oldugundan isleme alýnmadý");
			continue;//bekleme devam et komutudur... yok saymak pas geç gibi bir sey	
			//continue olmadan calisinca 5 ile 10 arasindaki degerleri de topluyor
			}
			toplam+=sayi;
		}
		System.out.println("girdiginiz sayilarin toplamý: "+toplam);
	}

}
