package day05_MatematikselIslemler;

import java.util.Scanner;

public class C03_Modulus {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 3 basamakl? say? giriniz");
		int num=scan.nextInt();
		//num 573 olsun
		int rakamlarToplami=0;
		
		int rakam=num%10;//bana birler basamag?n? verir rakam=3
		
		rakamlarToplami+=rakam;//rakamlar toplami 3 oldu
		num/=10;
		rakam=num%10;
		rakamlarToplami+=rakam;//10
		System.out.println(rakamlarToplami);	
		num/=10;
		rakam=num%10;
		rakamlarToplami+=rakam;//15
		System.out.println(rakamlarToplami);	
		
		scan.close();
		
		
	}

}
