package day10_TernarySwitchCase;

import java.util.Scanner;

public class C03_Ternary {

	public static void main(String[] args) {
	//Soru3 ) Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin	
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir sayi giriniz");
		double a=scan.nextDouble();
		double mutlakDeger=a>0? a :-1*a;
		System.out.println(mutlakDeger);
		System.out.println(a>=0? a :-1*a);
		scan.close();
	}

}
