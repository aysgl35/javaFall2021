package day07_Practice;

import java.util.Scanner;

public class C14 {

	public static void main(String[] args) {
		/* Problem Tanýmý
	        Verilen bir sayýnýn faktöriyelini özyineli (recursive) olarak
	        hespalayan fonksiyonu yazýnýz.
	        Örnek Ekran Çýktýlarý
	        Bir sayi giriniz: 6
	        Faktöriyeli: 720
	        Bir sayý giriniz: 3
	        Faktöriyeli 6
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
