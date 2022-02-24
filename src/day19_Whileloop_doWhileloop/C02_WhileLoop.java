package day19_Whileloop_doWhileloop;

import java.util.Scanner;

public class C02_WhileLoop {

	public static void main(String[] args) {
	//kullanicidan bir sayi alýn rakamlar 
		//toplamini yazin
		Scanner scan =new Scanner(System.in);
		System.out.println("lutfen pozitif bir sayi giriniz");
		int sayi=scan.nextInt();
		int rakamlarToplami=0;
		int rakam=0;
		while (sayi>0) {
		rakam=sayi%10;
		rakamlarToplami+=rakam;
		sayi/=10;
		
		}
	System.out.println("girdiginiz sayinin rakamlar toplami: "+rakamlarToplami);		
			
		}


	}


