package day44_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C05_ListIterator {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List <String> liste=new ArrayList<>();
		liste.add("Ali");
		liste.add("Veli");
		liste.add("Ayse");
		liste.add("Fatma");
		liste.add("Emrah");
		System.out.println("******1.yol******");
		System.out.println(liste);//[Ali, Veli, Ayse, Fatma, Emrah]
		ListIterator li1 =liste.listIterator();
		
		String temp="";
		
		while (li1.hasNext()) {
			//li1.set(li1.next()+"X");
			temp=(String) li1.next();
			li1.set(temp+"+");
		}
		
		System.out.println(liste);
		List <String> liste2=new ArrayList<>();
		liste2.add("Ahmet");
		liste2.add("Veysel");
		liste2.add("Ayten");
		System.out.println("******2.yol******");
		System.out.println(liste2);
		
		@SuppressWarnings("rawtypes")
		ListIterator li2 =liste2.listIterator();
		while (li2.hasNext()) {
			li2.set(li2.next()+"*");
			
		}
		System.out.println(liste2);
	}

}
