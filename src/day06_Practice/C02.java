package day06_Practice;

public class C02 {

	public static void main(String[] args) {
		 /*

	       sayacý ritmik ilerleyen ve adým sayýsý belli ise FOR kullanýlýr.
	       DEÐÝLSE While kullanýlýr, Eðer döngüye bir kez mutlaka girilecekse DO_WHILE kullanýlýr.

	       Problem Tanýmý
	        100'den 0'a kadar 13'e tam bölünebilen sayýlarý ve toplamlarýný ekrana yazdýrýnýz (büyükten küçüðe).

	         Ekran Çýktýsý
	        91
	        78
	        65
	        52
	        39
	        26
	        13       */

		int toplam=0;
		for (int i = 100; i >=0; i--) {
			if (i%13==0) {
				System.out.println(i+" ");
				toplam+=i;
			}
			
		}
		System.out.println("");
		System.out.println("toplam : "+ toplam);
	}

}
