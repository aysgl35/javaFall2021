package day10_TernarySwitchCase;

import java.util.Scanner;

public class C01_Ternary {

	public static void main(String[] args) {
//Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen iki sayi giriniz");
		double a=scan.nextDouble();
		double b=scan.nextDouble();
		
		System.out.println(a>b? b:a);
		
		
		
		scan.close();
	}

}
