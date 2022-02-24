package day04_Practice;

import java.util.Scanner;

public class C02_StringMethod {

	public static void main(String[] args) {
		/*
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */


        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir isim giriniz :");
        String isim = scan.nextLine();
        char c1=isim.charAt(0);//ismin ilk harfi
        char c2=isim.charAt(1);//ismin ikinci harfi
        char c3=isim.charAt(2);//ismin ucuncu harfi
        System.out.println("*********if ile*********");
        if(isim.length()==3) {
        	if (c1!=c2 &&c1!=c3 &&c3!=c2 ) {
        		System.out.println("girilen isim 3 harfli ve unigue(yünig benzersiz)");
				
			}else {
				System.out.println("girilen isim 3 harfli ama unigue degil");
			}
        }else {
        	System.out.println("girdiginiz isim 3 harfli degil");
        }
        System.out.println("******************ternary************"); 
        
        String sonuc=isim.length()==3 ?(c1!=c2 &&c1!=c3 &&c3!=c2)?
        		"girilen isim 3 harfli ve unigue":"girilen isim 3 harfli ama unigue degil":
        			"girdiginiz isim 3 harfli degil";
        System.out.println(sonuc);
	}

}
