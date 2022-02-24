package day46_Collections;

import java.util.Set;
import java.util.TreeSet;

public class C02_RetainAll {

	public static void main(String[] args) {
		Set<String>lhs1= new TreeSet<>();
		lhs1.add("Ali");
		lhs1.add("Veli");
		lhs1.add("Canan");
		lhs1.add("Remziye");
		System.out.println(lhs1);//[Ali, Canan, Remziye, Veli]
		//TreeSet elemanlari natural order a göze dizer 
		//string alfabetik, sayi ise kucukten buyuge
		//TreeSet en yavastir bu yüzden az kullanilir
		Set<String>lhs2= new TreeSet<>();
		lhs2.add("Ali");
		lhs2.add("Veli");
		System.out.println(lhs1.retainAll(lhs2));//true
		System.out.println(lhs1);//[Ali, Veli]
	}

}
