package day01_practice;

import java.util.Scanner;

public class C06_Calimarim {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		int ortalama =(num1+num2+num3)/3;
		System.out.println("Girdiginiz sayilarin ortalamasi: "+ortalama);
		scan.close();

	}

}
