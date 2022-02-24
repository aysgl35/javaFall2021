package day07_IfStatements;

import java.util.Scanner;

public class C06_IfSoru {

	public static void main(String[] args) {
		/*
    	 * Kullanicidan alacaginiz vize1 vize2 ve final notlarini 
    	 * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
    	 */
	Scanner scan =new Scanner (System.in);
	System.out.println("lutfen vize1 notunu giriniz");
	int vize1=scan.nextInt();
	System.out.println("lutfen vize2 notunu giriniz");
	int vize2=scan.nextInt();
	System.out.println("lutfen final notunu giriniz");
	int fnl=scan.nextInt();
	double ortalama=(vize1+vize2)/2*0.3+(fnl*0.7);
	System.out.println(ortalama);
	if (ortalama<=50) {
		System.out.println("Maalesef kaldýnýz");
		
	}
	if (ortalama>=51) {
		System.out.println("Tebrikler geçtiniz");
		
	}
	scan.close();
	}

}
