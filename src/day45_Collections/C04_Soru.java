package day45_Collections;

import java.util.LinkedList;
import java.util.Scanner;

public class C04_Soru {

	public static void main(String[] args) {
		LinkedList<String>ll=new LinkedList<>();
		ll.add("Ayse");
		ll.add("Ali");
		ll.add("Alp");
		ll.add("Akif");
		ll.add("Ayten");
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir isim giriniz");
		String isim=scan.nextLine();
		String name=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
		System.out.println(name);
		System.out.println(ll);
		
		if (ll.remove(name)) {
					System.out.println(isim + " bu isim linkedlist de vardi ve silindi");
						
		}else System.out.println(isim + " bu isim linkedlist de yoktu bu nedenle silinemedi");
			 {
				
				
			 }		
			System.out.println(ll);	
		
		scan.close();
	}

}
