package day15_MethodCreation;

import java.util.Scanner;

public class C02_MethodCreation {

	public static void main(String[] args) {
/*Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun.
 *  Kullanici 2,3 veya 4 degerini girerse, kullanicidan 
 *  bu sayilari girmesini isteyin ve sayilarin 
 *  toplamini yazdirin. Kullanici toplamak istedigi 
 *  sayi adedini 4’den buyuk girerse 
 *  “Cok sayi girdiniz, ben toplayamam” yazdirin.
 * 
 */
		Scanner scan = new Scanner (System.in);
		System.out.println("lutfen toplamak istediginiz sayi adedini 2,3 veya 4 den biri olarak secin");
		int tercih =scan.nextInt();
		if (tercih>4) {
			tercih=5;
			
		}
		switch (tercih) {
		case 2:
			ikiSayiTopla();
			
			break;
		case 3:
			ucSayiTopla();
			
			break;
		case 4:
			dortSayiTopla();
			
			break;
		case 5:
			System.out.println("Cok sayi girdiniz, ben toplayamam");
			
			break;
			
		default:
			System.out.println("gecersiz tercih");
		}
		
		
		
		
		
		scan.close();
	}

	public static void dortSayiTopla() {
		Scanner scan = new Scanner (System.in);
		System.out.println("lutfen dort sayi girin");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		double sayi3=scan.nextDouble();
		double sayi4=scan.nextDouble();
		System.out.println("dort sayinin toplami = " + (sayi1 + sayi2 + sayi3 + sayi4));
        scan.close();
	}

	public static void ucSayiTopla() {
		Scanner scan = new Scanner (System.in);
		System.out.println("lutfen uc sayi girin");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		double sayi3=scan.nextDouble();
		System.out.println("uc sayinin toplami = " + (sayi1 + sayi2 + sayi3 ));
        scan.close();
	}

	public static void ikiSayiTopla() {
		Scanner scan = new Scanner (System.in);
		System.out.println("lutfen iki sayi girin");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		System.out.println("iki sayinin toplami = " + (sayi1 + sayi2 ));
        scan.close();
	}

}
