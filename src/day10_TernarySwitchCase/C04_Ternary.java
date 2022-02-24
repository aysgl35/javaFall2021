package day10_TernarySwitchCase;

import java.util.Scanner;

public class C04_Ternary {

	public static void main(String[] args) {
//Soru4 ) Kullanicidan bir sayi alin. Sayi pozitifse “Sayi pozitif” yazdirin, negatifse  sayinin karesini yazdirin
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir sayi giriniz");
		double a=scan.nextDouble();
		//String sonuc=a<0? a*a :"sayi pozitiftir" ;
		System.out.println(a>0? "sayi pozitif": a*a);
		scan.close();
	}

}
