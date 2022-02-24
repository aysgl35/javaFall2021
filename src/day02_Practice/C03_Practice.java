package day02_Practice;

import java.util.Scanner;

public class C03_Practice {

	public static void main(String[] args) {
		/*
         *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
         *
        BMI = kilo(kg) /(boy/100*boy/100)(cm)
        BMI <=20 oldukca zayifsiniz
        20<BMI<=25 Normal sinirlardasiniz 
        25<BMI<=30 Sisman kategorisindesiniz
        30<BMI ==> Obez grubundasiniz.
        
         */
	Scanner scan = new Scanner(System.in);
	System.out.println("lutfen kilonu ve boyunuzu giriniz");
	double kilo=scan.nextDouble();
	double boy=scan.nextDouble();
	double vki=kilo/(boy/100*boy/100);
	
	
	if (vki<=20) {
		System.out.println("oldukça zayifsýnýz");
		
	}else if (vki>20 && vki<=25) {
		System.out.println("normal sinirdasiniz");
		
	}else if (vki>25 && vki<=30) {
		System.out.println("Sisman kategorisindesiniz");
		
	}else if (vki>30) {
		System.out.println("obez grubundasýnýz");
	}else {
		System.out.println("yanliþ deðer ");
	}
}
}