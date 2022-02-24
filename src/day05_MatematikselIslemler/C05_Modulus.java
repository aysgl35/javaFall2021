package day05_MatematikselIslemler;

import java.util.Scanner;

public class C05_Modulus {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 6 basamaklý sayý giriniz");
		int num=scan.nextInt();
	
		int rakamlarToplami=0;
		
		int rakam=num%10;//bana birler basamagýný verir rakam=3
		
		rakamlarToplami+=rakam;//rakamlar toplami 3 oldu
		num/=10;
		rakam=num%10;
		rakamlarToplami+=rakam;
		System.out.println(rakamlarToplami);	
		num/=10;
		rakam=num%10;
		rakamlarToplami+=rakam;
		System.out.println(rakamlarToplami);	
		num/=10;
		rakam=num%10;
		rakamlarToplami+=rakam;
		System.out.println(rakamlarToplami);	
		num/=10;
		rakam=num%10;
		rakamlarToplami+=rakam;
		System.out.println(rakamlarToplami);
		num/=10;
		rakam=num%10;
		rakamlarToplami+=rakam;
		System.out.println(rakamlarToplami);	
		scan.close();
		
	}

}
