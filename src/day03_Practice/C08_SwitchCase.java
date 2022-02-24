package day03_Practice;

import java.util.Scanner;

public class C08_SwitchCase {

	public static void main(String[] args) {
		// Girilen bir ay numarasýna göre , ayýn kaç gün olduðunu sayý ile yazdýrýnýz
        Scanner scan = new Scanner (System.in);
       System.out.println("lutfen ay numarasý giriniz");
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
