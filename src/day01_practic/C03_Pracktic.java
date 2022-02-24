package day01_practic;

import java.util.Scanner;

public class C03_Pracktic {
	public static void main(String[] args) {
		/*
	      * kullanicinin ad soyad yas boy kilosunu alt alata yazdiriniz
	      */	
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your name");
		String name=scan.nextLine();
		System.out.print("Please enter your surname");
		String surName=scan.nextLine();
		System.out.print("Please enter your age");
		int age =scan.nextInt();
		System.out.print("Please enter your height");
		int height=scan.nextInt();
		System.out.print("Please enter your weight");
		int weight=scan.nextInt();
		System.out.println(name+"\n"+surName+"\n"+age+"\n"+
		height+"cm"+"\n"+weight+"kg");
		
		
		
		
	}

}
