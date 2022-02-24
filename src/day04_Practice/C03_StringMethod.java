package day04_Practice;

import java.util.Scanner;

public class C03_StringMethod {

	public static void main(String[] args) {
		/*
        Kullanicidan email girmesini isteyin
       @ isareti icermiyorsa "gecerli bir email girin" yazdirin
       @ isaretinden sonra sadece "gmail.com" yaziyorsa "email onaylandi" yazdirin
       @ isaretinden sonra "gmail.com" disinda birsey yaziyorsa "Lutfen gmail hesabinizi girin" yazdirin
       ORNEK:
       INPUT : techproed.com OUTPUT : "gecerli bir email girin "
       INPUT : techproed@gmail.com OUTPUT :  "email onaylandi "
       INPUT : techproed@hotmail.com OUTPUT : "Lutfen gmail hesabinizi girin"
       */
        //email.substring(email.indexOf("@"))== "@gmail.com"
		
		Scanner scan = new Scanner(System.in);
	    System.out.print("Lutfen mail adresinizi girin");
	    String mail = scan.next();
	    if (!mail.contains("@")) {
	    	System.out.println("gecerli bir email girin");
			
		}else if(mail.substring(mail.indexOf("@")).equals("@gmail.com")) {
			System.out.println("email onaylandý");
			
		}else {
			System.out.println("Lutfen gmail hesabinizi girin" );
		}

	}

}
