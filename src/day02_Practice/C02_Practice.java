package day02_Practice;

import java.util.Scanner;

public class C02_Practice {

	public static void main(String[] args) {
		/*
         * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
         *  dort islemden biri ile isleme koyup sonucun yazdiriniz
         */
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen iki sayi giriniz");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		System.out.println("lutfen yapmak istedi�iniz islemi secin : "
				+ "\n 1:toplama \n 1:toplama \n 2:c�karma  \n 3:carpma \n 4:bolme");
		int islem=scan.nextInt();
		
		if (islem==1) {
			System.out.println("Girdiginiz sayilar�n toplam� : "+ (sayi1+sayi2));
		}else if (islem==2) {
			System.out.println("Girdiginiz sayilar�n fark� : "+(sayi1-sayi2));
			
		}else if (islem==3) {
			System.out.println("Girdiginiz sayilar�n carp�m� : "+sayi1*sayi2);
			
		}else if (islem==4) {
			System.out.println("Girdiginiz sayilar�n bolumu : "+sayi1/sayi2);
			
		} else {
			System.out.println("Herkes hata yapabilir, uzulmeyin");
		}
		
		
		
		
		
		
		
		
		
		
		}

}
