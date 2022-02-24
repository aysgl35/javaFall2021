package day03_Scanner;

import java.util.Scanner;

public class C02_Scanner {

	public static void main(String[] args) {
	//Soru 7) Kullanicidan ismini alip isminin bas harfini yazdirin.	

		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter your name");	
		
		char firstLetter=scan.next().charAt(0);
		System.out.println( "first letter of your name : "+ firstLetter);
	scan.close();
	}

}
