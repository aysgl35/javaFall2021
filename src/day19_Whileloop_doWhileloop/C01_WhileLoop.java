package day19_Whileloop_doWhileloop;

import java.util.Iterator;
import java.util.Scanner;

public class C01_WhileLoop {

	public static void main(String[] args) {
	//soru 6) Kullanicidan bir sayi alin
	//ve bu sayiyi tam bolen sayilari
	//ve toplam kac tane olduklarini ekranda yazdirin
	
		Scanner scan =new Scanner(System.in);
		System.out.println("lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		int count=0;
		int bolen=1;
	
		while (bolen<=sayi) {
		if(sayi%bolen==0) {
			System.out.print(bolen +" ");
			count++;
		}
			bolen++;
		}
		System.out.println("");
	System.out.println(sayi +" sayisinin "+count + " adet tam böleni vardýr");
scan.close();
	}

}
