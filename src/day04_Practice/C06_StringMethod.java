package day04_Practice;

import java.util.Scanner;

public class C06_StringMethod {

	public static void main(String[] args) {
		//Kullan�c�dan alaca��n�z, 3 kelimeden olu�an ismi
        // �rn. Ahmet Emin Y�lmaz -> A.E.Y.  format�yla yazd�r�n�z.

        Scanner scan = new Scanner(System.in);
        System.out.print("L�tfen Ad�n�z� ve soyad�n�z� giriniz = "); //Ahmet Emin Yilmaz
        String adSoyad = scan.nextLine();
        char ilkHarf=adSoyad.toUpperCase().charAt(0);
        char ikinciHarf=adSoyad.toUpperCase().charAt(adSoyad.indexOf(" ")+1);
        char ucuncuHarf=adSoyad.toUpperCase().charAt(adSoyad.lastIndexOf(" ")+1);
        System.out.println(ilkHarf+"."+ikinciHarf+"."+ucuncuHarf);
	}

}
