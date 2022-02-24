package day04_IncrementDecrement;

import java.util.Scanner;

public class C04_Scanner {

	public static void main(String[] args) {
// kullanýcýdan deger almak için 3 adim oluþturulur
//1.adim Scanner objesi oluþturmak
// 2.adim kullaniciya ne istedigimizi söylemek
//3.adim
	Scanner scan = new Scanner (System.in);
	System.out.print("Lütfen isminizi giriniz");
	String name = scan.nextLine();
	System.out.println(name);
scan.close();
	}

}
