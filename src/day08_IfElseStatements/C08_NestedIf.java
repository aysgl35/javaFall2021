package day08_IfElseStatements;

import java.util.Scanner;

public class C08_NestedIf {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen cinsiyetinizi giriniz\nErkek için E, Kadin için K giriniz");
		char cinsiyet=scan.next().toUpperCase().charAt(0);
		System.out.println("Lutfen yaşinizi tamsayi olarak giriniz");
		double yas= scan.nextDouble();
		if (cinsiyet=='E') {
			if (yas>=65) {
				System.out.println("Emekli olabilirsiniz");
				
			} else {
				System.out.println("Emekli olamazsın");
			}
			
		} else if(cinsiyet=='K'){
			if (yas>=60) {
				System.out.println("Emekli olabilirsin");
			} else {
				System.out.println("Emekli olamazsin");
			}

		}else {
			System.out.println("Lutfen cinsiyet icin gecerli bir harf secin");
		}

	}

}
