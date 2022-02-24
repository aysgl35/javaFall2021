package day05_Practice;

import java.util.Scanner;

public class C07 {

	public static void main(String[] args) {
		/*
	    Problem Tan�m�:
	    addDigits isminde bir method olu�turun.
	    Parametresi int
	    Return tipi de int
	    Pozitif int de�erler ver ve en son sonu� tek basamakl� ��kana kadar basamaklar� birbiriyle topla.
	    Tek basamakl� ��kt���nda, d�nd�r�n
	    �rnek1:
	    Girdi 38
	    ��kt�: 2
	    A��klama: ��lemler ��yle olacak: 3 + 8 = 11, 1 + 1 = 2.
	                 2 , tek basamakl� oldu�undan, bunu d�nd�r�n.
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
	System.out.println("Girdiginiz sayinin rakamlar toplam� : "+toplam);
		return toplam;
	}

}
