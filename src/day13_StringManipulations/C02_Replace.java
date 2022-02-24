package day13_StringManipulations;

import java.util.Scanner;

public class C02_Replace {

	public static void main(String[] args) {
	
		//String olarak verilen 10.000 sayisinin
	// binden buyuk olup olmadigini yazdirin
		//Scanner scan =new Scanner(System.in);
		//System.out.println("lutfen bir sayi giriniz");
		//String sonuc = scan.next();
		String sonuc ="10.000";
		sonuc=sonuc.replace(".", "");
		System.out.println(sonuc);
		if (Integer.valueOf(sonuc)>10000) {
			System.out.println("bulunan sonuc sayisi 1000'den cok");
			
		} else {
			System.out.println("bulunan sonuc sayisi 1000'den az");

		}
	}

}
