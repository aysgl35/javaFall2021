package day04_Practice;

import java.util.Scanner;

public class C06_StringMethod {

	public static void main(String[] args) {
		//Kullanýcýdan alacaðýnýz, 3 kelimeden oluþan ismi
        // Örn. Ahmet Emin Yýlmaz -> A.E.Y.  formatýyla yazdýrýnýz.

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Adýnýzý ve soyadýnýzý giriniz = "); //Ahmet Emin Yilmaz
        String adSoyad = scan.nextLine();
        char ilkHarf=adSoyad.toUpperCase().charAt(0);
        char ikinciHarf=adSoyad.toUpperCase().charAt(adSoyad.indexOf(" ")+1);
        char ucuncuHarf=adSoyad.toUpperCase().charAt(adSoyad.lastIndexOf(" ")+1);
        System.out.println(ilkHarf+"."+ikinciHarf+"."+ucuncuHarf);
	}

}
