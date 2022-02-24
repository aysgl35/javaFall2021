package day07_Practice;

import java.util.Scanner;

public class C12 {

	public static void main(String[] args) {
		// Bir top belirli bir yükseklikten atýlmaktadýr.
		// Atýldýktan sonra, atýldýðý yüksekliðin 3/4 u kadar yerden yukarý doðru
		// zýplamaktadýr
		// Top zýplama yüksekliði 1 metrenin altýna indiðinde durmaktadýr.
		// Bu ana kadar aldigi toplam yolu ve yere vurma sayýsýný bulunuz.

		Scanner scan = new Scanner(System.in);
		System.out.println("topun birakildigi yüksekligi giriniz");
		double yukseklik = scan.nextDouble();
		double topunToplamYolu = 0;
		int yereVurmaSayisi = 0;

		do {
			yereVurmaSayisi++;
			topunToplamYolu += yukseklik;
			yukseklik *= (0.75);// 3/4
			topunToplamYolu += yukseklik;

		} while (yukseklik >= 1);

		System.out
				.println("topun aldigi toplam yol : " + topunToplamYolu + "\n yere vurma sayisi : " + yereVurmaSayisi);
	}

}
