package day01_practic;

import java.util.Scanner;

public class C05_Practice2 {

	public static void main(String[] args) {
		/*
		 *  Kullanicidanalacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
		 *  
		 *   Ex :
		 *   input  : 12345
		 *   output : 12
		 */
		Scanner scan = new Scanner (System.in);
		System.out.println("lutfen 5 basamaklý sayi giriniz");
		int sayi =scan.nextInt();
		int sonIki=sayi%100;
		int ilkIki=sayi/1000%100;
		System.out.println(ilkIki+sonIki);
	}

}
