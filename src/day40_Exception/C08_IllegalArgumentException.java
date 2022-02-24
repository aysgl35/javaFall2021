package day40_Exception;

import java.util.Scanner;

public class C08_IllegalArgumentException {

	public static void main(String[] args) {
		//kullanicidan yasini girmesini isteyin
		//kodumunu kullanici sifirdan kucuk bir sayi girerse Exception verecek sekilde yazin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen konsolda gormek icin yasinizi giriniz");
		int yas=scan.nextInt();
		
		try {
			if (yas<0) {
				throw  new IllegalArgumentException();
				
			}else System.out.println(yas);
			
		} catch (IllegalArgumentException e) {
			System.out.println(e);
			System.out.println("Yas icin negatif deger giremezsiniz...");
		}
		System.out.println(yas);
		scan.close();
	}

}
