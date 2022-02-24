package day07_Practice;

import java.util.Scanner;

public class C12 {

	public static void main(String[] args) {
		// Bir top belirli bir y�kseklikten at�lmaktad�r.
		// At�ld�ktan sonra, at�ld��� y�ksekli�in 3/4 u kadar yerden yukar� do�ru
		// z�plamaktad�r
		// Top z�plama y�ksekli�i 1 metrenin alt�na indi�inde durmaktad�r.
		// Bu ana kadar aldigi toplam yolu ve yere vurma say�s�n� bulunuz.

		Scanner scan = new Scanner(System.in);
		System.out.println("topun birakildigi y�ksekligi giriniz");
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
