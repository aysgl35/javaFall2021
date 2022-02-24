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
		System.out.println("lutfen yapmak istediðiniz islemi secin : "
				+ "\n 1:toplama \n 1:toplama \n 2:cýkarma  \n 3:carpma \n 4:bolme");
		int islem=scan.nextInt();
		
		if (islem==1) {
			System.out.println("Girdiginiz sayilarýn toplamý : "+ (sayi1+sayi2));
		}else if (islem==2) {
			System.out.println("Girdiginiz sayilarýn farký : "+(sayi1-sayi2));
			
		}else if (islem==3) {
			System.out.println("Girdiginiz sayilarýn carpýmý : "+sayi1*sayi2);
			
		}else if (islem==4) {
			System.out.println("Girdiginiz sayilarýn bolumu : "+sayi1/sayi2);
			
		} else {
			System.out.println("Herkes hata yapabilir, uzulmeyin");
		}
		
		
		
		
		
		
		
		
		
		
		}

}
