package day07_IfStatements;

import java.util.Scanner;

public class C05_IfSoru {
public static void main(String[] args) {
	/*
	 * Soru 5) Kullanicidan bir gun alin eger gun �Cuma� ise ekrana �Muslumanlar icin kutsal
gun� yazdirin. �Cumartesi� ise ekrana �Yahudiler icin kutsal gun� yazdirin. �Pazar�
ise ekrana �Hiristiyanlar icin kutsal gun� yazdirin
	 */
	Scanner scan= new Scanner(System.in);
	System.out.println("Lutfen g�n ismi yaz�n�z");
	String gun =scan.next().toLowerCase();
	
	if (gun.equals("cuma")) {
		System.out.println("Musl�manlar i�in kutsal g�n");
		
	}
	if (gun.equals("cumartesi")) {
		System.out.println(" Yahudiler i�in kutsal g�n");
		
	}
	if (gun.equals("pazar")) {
		System.out.println("Hristiyanlar i�in kutsal g�n");
		
	}
	scan.close();
}

}
