package day13_StringManipulations;

import java.util.Scanner;

public class C01_StartsWith_EndsWith {

	public static void main(String[] args) {
	//Kullanicidan bir cumle ve bir kelime alin
	//verilen cumleninin verilen kelime(char squence) ile baslayip,
	//baslamadigini ve bitip bitmedigini yazdirin
	Scanner scan =new Scanner(System.in);
	System.out.println("lutfen bir cumle giriniz");
	String cumle = scan.nextLine().toLowerCase();
	System.out.println("lutfen bir kelime giriniz");
	String kelime = scan.next().toLowerCase();
	if (cumle.startsWith(kelime)) {
		System.out.println("girilen cumle "+ kelime+ " ile baslýyor");
	} else {
		System.out.println("girilen cumle "+ kelime+ " ile baslamýyor");
	}
	if (cumle.endsWith(kelime)) {
		System.out.println("girilen cumle "+ kelime+ " ile bitiyor");
	} else {
		System.out.println("girilen cumle "+ kelime+ " ile bitmiyor");
	}
	scan.close();
	
	}

}
