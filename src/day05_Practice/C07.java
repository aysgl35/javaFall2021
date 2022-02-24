package day05_Practice;

import java.util.Scanner;

public class C07 {

	public static void main(String[] args) {
		/*
	    Problem Tanýmý:
	    addDigits isminde bir method oluþturun.
	    Parametresi int
	    Return tipi de int
	    Pozitif int deðerler ver ve en son sonuç tek basamaklý çýkana kadar basamaklarý birbiriyle topla.
	    Tek basamaklý çýktýðýnda, döndürün
	    Örnek1:
	    Girdi 38
	    Çýktý: 2
	    Açýklama: Ýþlemler þöyle olacak: 3 + 8 = 11, 1 + 1 = 2.
	                 2 , tek basamaklý olduðundan, bunu döndürün.
	         */
		Scanner scan =new Scanner(System.in);
		System.out.println("lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		addDigits(sayi); 	
scan.close();
	}

	public static int addDigits(int num) {
		for (int i = 0; i < 5; i++) {
			num=sum(num);
			if (num<10) 
				break;
			
		}
			return sum(num);
	
}

	public static int sum(int num) {
		int toplam=0;
		int rakam=0;
		
		while (num>0) {
			rakam=num%10;
			toplam+=rakam;
			num/=10;
			
		}
	System.out.println("Girdiginiz sayinin rakamlar toplamý : "+toplam);
		return toplam;
	}

}
