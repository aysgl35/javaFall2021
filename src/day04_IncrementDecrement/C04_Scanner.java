package day04_IncrementDecrement;

import java.util.Scanner;

public class C04_Scanner {

	public static void main(String[] args) {
// kullan�c�dan deger almak i�in 3 adim olu�turulur
//1.adim Scanner objesi olu�turmak
// 2.adim kullaniciya ne istedigimizi s�ylemek
//3.adim
	Scanner scan = new Scanner (System.in);
	System.out.print("L�tfen isminizi giriniz");
	String name = scan.nextLine();
	System.out.println(name);
scan.close();
	}

}
