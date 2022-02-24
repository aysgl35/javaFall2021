package day02_Practice;

import java.util.Scanner;

public class C04_Practice {

	public static void main(String[] args) {
		//Kullanicidan bir sayi aliniz
        //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        //Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
		Scanner scan = new Scanner (System.in);
		System.out.print("lutfen sayi girniz :  ");
		int sayi=scan.nextInt();
		System.out.println("*******ternary cozum********");
		String result=(sayi>=0)?(sayi<10)?("rakam"):("Pozitif Sayi"):("Negatif Sayi");
		System.out.println(result);
		System.out.println("********If cozum********");
		 if (sayi>=0) {
	            if (sayi<10) {
	                System.out.println("rakam");
	            }else {
	                System.out.println("pozitif sayi");
	            }
	            
	        }else {System.out.println("Negatif Sayi");
	            
	        }
	}

}
