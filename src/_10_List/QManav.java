package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QManav {
	static List<String> urunListesi = new ArrayList<>();
	static List<Double> urunFiyatlari = new ArrayList<>();
	static double toplanOdenecekTutar;

	public static void main(String[] args) {
		/*
		 * Basit bir 5 Ã¼rÃ¼nlÃ¼ manav alisveris programi yaziniz.
		 *
		 * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor. 2. Adim :
		 * Baska bir urun almak isteyip istemedigini sor. istemiyorsa toplam miktari
		 * goster, istiyorsa tekrar urun sectir. Bu islemi alisverisi bitirmek isteyene
		 * kadar tekrarla. 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini
		 * toplam fiyata ekle. 4. Adim : Alisveris bitince toplam odemesi gereken tutari
		 * goster.
		 *
		 */
		
		urunListesi.add("domat-urun kodu : 1");
		urunListesi.add("elma-urun kodu : 2");
		urunListesi.add("muz-urun kodu : 3");
		urunListesi.add("biber-urun kodu : 4");
		urunListesi.add("patlýcan-urun kodu : 5");

		urunFiyatlari.add(5.0);
		urunFiyatlari.add(7.5);
		urunFiyatlari.add(11.3);
		urunFiyatlari.add(8.7);
		urunFiyatlari.add(9.2);

		System.out.println(urunListesi);
		musteriSecim();

	}

	private static void musteriSecim() {
		Scanner scan = new Scanner(System.in);
		System.out.println("hangi urunu secmek istersiniz");
		int secim = scan.nextInt();

		System.out.println("sectiginiz urunden kac kilo alacaksýnýz");
		double kilo=scan.nextDouble();
		double urunTutari=urunFiyatlari.get(secim-1);
		double urunTutarToplam=kilo*urunTutari;
		toplanOdenecekTutar+=urunTutarToplam;
		System.out.println("devam edecekseniz 1, kasa icin 2 seciniz..");
		int karar=scan.nextInt();
		if (karar==1) {
			musteriSecim();
		}else kasa();
	
	
	
	}

	private static void kasa() {
	System.out.println("odeyeceginiz tutar : "+ toplanOdenecekTutar);	
		
	}
}
