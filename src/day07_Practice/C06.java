package day07_Practice;

import java.util.Scanner;

public class C06 {

	static int bolum=0;//class level de bir veriable ilk degeri 0 atandý

	public static void main(String[] args) {
	// kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru 
	//kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.
	//10/2=5 demek 10 dan 5 tane iki çýkarýrsam bölme islemini yapmýþ olurum			
		Scanner scan = new Scanner(System.in);
        System.out.print("bolunen sayiyi giriniz : ");
        int bolunen=scan.nextInt();
        System.out.println("bolen sayiyi giriniz : ");
        int bolen=scan.nextInt();
        System.out.println("sonuc : " +bol(bolunen, bolen));
	}
	public static int bol (int bolunen, int bolen) {
		while (bolunen>=bolen) {
			bolunen-=bolen;
			bolum++;
		}
		
		
		return bolum;
		
	}
}
