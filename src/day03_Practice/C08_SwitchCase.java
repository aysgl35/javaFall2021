package day03_Practice;

import java.util.Scanner;

public class C08_SwitchCase {

	public static void main(String[] args) {
		// Girilen bir ay numaras�na g�re , ay�n ka� g�n oldu�unu say� ile yazd�r�n�z
        Scanner scan = new Scanner (System.in);
       System.out.println("lutfen ay numaras� giriniz");
       int ayNo=scan.nextInt();
       switch (ayNo){
           case 1 : case 3 : case 5 : case 7 : case 8 : case 10 :  case 12 :
               System.out.println("31");
           break;
           case 4 : case 6 : case 9 : case 11 :
               System.out.println("30");
               break;  
           default:
               System.out.println("28");
       }

	}

}
