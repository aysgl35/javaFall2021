package day01_practic;

import java.util.Scanner;

public class C04_Pracktic {

	public static void main(String[] args) {
		
	//kullanicidan 2 tam sayi alip bu 2 tam sayinin dort islem sonucunu yazdýrýnýz
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter the first number");
	int num1=scan.nextInt();
	System.out.println("Please enter the second number");
	int num2=scan.nextInt();
	System.out.println("Sum of entered numbers:"+(num1+num2));
	System.out.println("difference of the entered numbers:"+(num1-num2));
	System.out.println("The product of entered numbers:"+(num1*num2));
	System.out.println("Part of entered numbers:"+(num1/num2));
	}

}
