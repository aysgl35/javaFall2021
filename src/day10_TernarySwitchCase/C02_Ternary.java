package day10_TernarySwitchCase;

import java.util.Scanner;

public class C02_Ternary {

	public static void main(String[] args) {
//kullan�c�dan bir sayi alin cift mi tek mi oldu�unu yaz�n		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen iki sayi giriniz");
		int a=scan.nextInt();
		System.out.println(a%2==0? "cift sayi" : "tek sayi");
		scan.close();
	}

}
