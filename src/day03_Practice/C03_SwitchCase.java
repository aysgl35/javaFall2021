package day03_Practice;

import java.util.Scanner;

public class C03_SwitchCase {

	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		System.out.println("lutfen uc basamaklý sayi giriniz");
		int num =scan.nextInt();
		int yuzler = num/100, onlar=num/10%10, birler=num%10;
		if (99<num&&num<1000) {
		switch (yuzler) {
		case 1:
			System.out.print("yuz");
			break;
		case 2:
			System.out.print("iki yuz");
			break;
		case 3:
			System.out.print("uc yuz");
			break;
		case 4:
			System.out.print("dort yuz");
			break;
		case 5:
			System.out.print("bes yuz");
			break;
		case 6:
			System.out.print("alti yuz");
			break;
		case 7:
			System.out.print("yedi yuz");
			break;
		case 8:
			System.out.print("sekiz yuz");
			break;
		case 9:
			System.out.print("dokuz yuz");
			break;
		}
		switch (onlar) {
		
		case 1:
			System.out.print(" on");
			break;
		case 2:
			System.out.print(" yirmi");
			break;
		case 3:
			System.out.print(" otuz");
			break;
		case 4:
			System.out.print(" kirk");
			break;
		case 5:
			System.out.print(" elli");
			break;
		case 6:
			System.out.print(" altmýs");
			break;
		case 7:
			System.out.print(" yetmis");
			break;
		case 8:
			System.out.print(" seksen");
			break;
		case 9:
			System.out.print(" doksan");
			break;
		
		}
		switch (birler) {
		
		case 1:
			System.out.print(" bir");
			break;
		case 2:
			System.out.print(" iki");
			break;
		case 3:
			System.out.print(" uc");
			break;
		case 4:
			System.out.print(" dort");
			break;
		case 5:
			System.out.print(" bes");
			break;
		case 6:
			System.out.print(" alti");
			break;
		case 7:
			System.out.print(" yedi");
			break;
		case 8:
			System.out.print(" sekiz");
			break;
		case 9:
			System.out.print(" dokuz");
			break;
			
		}
		}else {
			System.out.println("Gecerli bir sayi giriniz");
			
		}
			
			
		}
	}


