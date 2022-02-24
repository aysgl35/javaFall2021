package day14_Method;

import java.util.Scanner;

public class C02_Method {

	public static void main(String[] args) {
		/*// kullanicidan iki sayi isteyin
		// sayilarin karelerini ve kuplerini toplyaip yazdiran bir method yazdirin
		// kullaniciya us sorun
		// 2 yazarsa kareleri toplamini yapan method 3 yazarsa kupler toplamini yapan
		// method calissin
****************************************************************
		 * Bir method'u 4 adimda olustururuz
		 * 1-methodu javaya olusturabilmek icin method call yapiyoruz
		 * 2-arguman ihtiyaci var mi belirleyelim
		 * 3-java'dan yardim alarak methodu olusturalým
		 * 
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("lutfen iki sayi girin");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		System.out.println("girilen sayilarin kareler toplami için 2 ye , kupler toplamý için"
				+ " 3 e basin");
		int secim = scan.nextInt();
		switch (secim) {
		case 2:
			kareTopla(sayi1,sayi2);
			break;
		case 3:
			kupTopla(sayi1,sayi2);
		break;
		default:System.out.println("lutfen istenen tercihlerden birini yapin");
		scan.close();
		}
		}
	

	public static void kupTopla(double x, double y) {
		double kuplerToplami=x*x*x+y*y*y;
		System.out.println("girilen sayilarin kuplerinin toplamý :"+kuplerToplami);
	}

	public static void kareTopla(double a, double b) {
	//bizim arguman isimlerimizle, parametre isimlerimiz ayni olmak zorunda degil
	//java isimlere degil degerlere bakar
	//bu bir zorunluluk degil imkandir,istedigimizi tercih edebiliriz
		double karelerToplami=a*a+b*b;
		System.out.println("girilen sayilarin karelerinin toplamý :"+karelerToplami);
		
		
		
		
	}

}
