package day07_Practice;

import java.util.Scanner;

public class C14 {

	public static void main(String[] args) {
		/* Problem Tan�m�
	        Verilen bir say�n�n fakt�riyelini �zyineli (recursive) olarak
	        hespalayan fonksiyonu yaz�n�z.
	        �rnek Ekran ��kt�lar�
	        Bir sayi giriniz: 6
	        Fakt�riyeli: 720
	        Bir say� giriniz: 3
	        Fakt�riyeli 6
	     */
		Scanner scan = new Scanner(System.in);
		System.out.println("bir sayi giriniz");
		int sayi = scan.nextInt();
		int faktoriyel=1;
		while (sayi>0) {
			faktoriyel*=sayi;
			sayi--;
		}
		System.out.println("faktoriyel: " +faktoriyel);
	}

}
