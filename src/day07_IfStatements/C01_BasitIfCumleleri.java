package day07_IfStatements;

import java.util.Scanner;

public class C01_BasitIfCumleleri {

	public static void main(String[] args) {
		 /*
         * Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin 
         * ve o harfle baslayan gun isimlerini yazdirin 
            Ornek:  ilkHarf=P output = “Pazar, Pazartesi veya Persembe”             
            ilkHarf=S output = “Sali”
         *** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin
         */
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen gün isimlerinden birinin ilk harfini yazýnýz");
		
		//kullanýcýnýn girdiði verinin tamamini kucuk harf veya buyuk harf yapabiliriz
		//char ilkHarf=scan.next().charAt(0);
		char ilkHarf=scan.next().toUpperCase().charAt(0);
		System.out.println(ilkHarf);
		if (ilkHarf=='P') {
			System.out.println("Pazar,Pazartesi veya Perþembe");
		}
		if (ilkHarf=='S') {
			System.out.println("Sali");
			
		}
		if (ilkHarf=='C'||ilkHarf=='c') {
			System.out.println("Carþamba, Cuma veya Cumartesi");
		}
		 if (ilkHarf!='C' || ilkHarf!='P' || ilkHarf!='S') {
	            System.out.println("Gecersiz harf girdiniz ."
	         + "Lutfen gun isimlerinden birinin basharfini yazin");
	        }
		
		scan.close();
	}

}
