package day19_Whileloop_doWhileloop;

import java.util.Scanner;

public class C03_ForLoop {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("lutfen pozitif bir sayi giriniz");
		int sayi=scan.nextInt();
		int rakamlarToplami=0;
		int rakam=0;
		String sayiStr=""+sayi;
//
		for (int i = 0; i < sayiStr.length(); i++) {
			rakam=sayi%10;
			rakamlarToplami+=rakam;
			sayi/=10;
			
		}
		
		System.out.println("girdiginiz sayinin rakamlar toplami: "+rakamlarToplami);
		scan.close();
	}

}
