package day06_Practice;

import java.util.Iterator;
import java.util.Scanner;

public class C07 {

	public static void main(String[] args) {
		  /*  Problem Tan�m�
	       2 boyutlu bir tablo olarak, ekrana �arp�m tablosunu hesaplay�p yazan kodu yaz�n�z.

	       �rnek Ekran ��kt�s�
	       1  2  3  4  5
	       2  4  6  8 10
	       3  6  9 12 15
	       4  8 12 16 20
	       5 10 15 20 25

	       Ekran ��kt�s� 5 x 5 boyutlar� i�in �rnek olarak verilmi�tir,
	       isterseniz boyutlar� klavyeden okuyup istenen boyutlara g�re
	       ekrana basan bir kod yazabilirsiniz.
	    */	
	Scanner scan = new Scanner (System.in);
	System.out.println("carpim toplosunun boyutunu giriniz: ");
	int boyut =scan.nextInt();
	
	for (int i = 1; i <=boyut; i++) {
		for (int j = 1; j <= boyut; j++) {
		System.out.print(" "+i*j);
			
		}
		System.out.println("");
	}
	
	
	
	}

}
