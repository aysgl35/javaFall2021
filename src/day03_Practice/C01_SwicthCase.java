package day03_Practice;

import java.util.Scanner;

public class C01_SwicthCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("lutfen notuzunu girin");
		int not=scan.nextInt();
		switch (not/10) {
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("notunuz D");// 0 ile 50 aras�
			break;
		case 5:
		System.out.println("notunuz C");//50 ile 60 aras�
		case 6:
		case 7:
			System.out.println("notunuz B");// 60 ile 70 aras�
			break;
		case 8:
		case 9:
		case 10:
			System.out.println("notunuz A");// 80 ile 100 aras�
			break;
		default:
			System.out.println("gecerli bir not giriniz");
		}

	}

}
