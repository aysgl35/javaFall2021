package day44_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class C04_Iterator {

	public static void main(String[] args) {
		
		//iterator kullanarak tum elementleri silin
		List <Integer> liste=new ArrayList<>();
		liste.add(8);
		liste.add(7);
		liste.add(4);
		liste.add(9);
		liste.add(2);
		liste.add(1);
		System.out.println(liste);
		//liste.clear();
		Iterator ite1 =liste.iterator();
		while (ite1.hasNext()) {
			ite1.next();
			ite1.remove();
		}
		System.out.println(liste);
	}

}
