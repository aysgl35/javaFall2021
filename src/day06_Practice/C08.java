package day06_Practice;

import java.util.Iterator;
import java.util.Scanner;

public class C08 {

	public static void main(String[] args) {
		/*  Problem Tan�m�
        Matrisin boyutunu kullan�c�dan okuyup.
        Sadece diyagonu (k��egeni) 1 olan ve
        di�er elemanlar� 0 olan bir kare matrisi ekrana bast�r�n.

       Ekran ��kt�s�
        Bir say� giriniz: 7
        1000000
        0100000
        0010000
        0001000
        0000100
        0000010
        0000001

        Bir sayi giriniz: 5
        10000
        01000
        00100
        00010
        00001
   */
		
			Scanner scan = new Scanner(System.in);
			System.out.print("matrisin boyutunu giriniz : ");
				int boyut=scan.nextInt();
		for (int satir = 1; satir <=boyut; satir++) {
			
			for (int sutun = 1; sutun <=boyut; sutun++) {
				if (satir==sutun) {
					System.out.print("1 ");
					
				}else{
					System.out.print("0 ");
				}
				
				
			}
			System.out.println();
		}		
				
				
				}

	}


