package day07_Practice;

import java.util.Scanner;

public class C09 {

	public static void main(String[] args) {
	//  kullanicinin INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazýnýz.

		Scanner scan = new Scanner(System.in);
        System.out.print("pin code giriniz : ");
        int userPin=scan.nextInt();		
		int systemPin=1453;
		int count=1;
		while (userPin!=systemPin) {
			System.out.println("****** hatali giris yapildi******");
			System.out.println("******** bir daha deneyin********");
		
				userPin=scan.nextInt();
				count++;
				if (userPin!=systemPin&&count==3) {
					System.out.println("hakkýnýz dolmuþtur ");
					break;
				}
		
		}
		System.out.println("gayet baþarili...");
	}

}
