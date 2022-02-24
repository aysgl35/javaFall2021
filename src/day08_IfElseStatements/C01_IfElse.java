package day08_IfElseStatements;

import java.util.Scanner;

public class C01_IfElse {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        
	        System.out.println("Lutfen dikdorgenin bir kenar uzunlugunu girin");
	        
	        double kenar1=scan.nextDouble();
	        
	        System.out.println("Lutfen dikdorgenin diger kenar uzunlugunu girin");
	        
	        double kenar2=scan.nextDouble();
	        
	        
	        if (kenar1==kenar2) {
	            System.out.println("girilen dikdortgen kare");
	        }
	        
	        else {
	            System.out.println("girilen dikdortgen kare degil");
	        }
	        
	       scan.close(); 

	}

}
