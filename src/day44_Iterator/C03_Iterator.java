package day44_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C03_Iterator {

	public static void main(String[] args) {
		List <Integer> liste=new ArrayList<>();
		liste.add(8);
		liste.add(7);
		liste.add(4);
		liste.add(9);
		liste.add(2);
		liste.add(1);
		System.out.println(liste);
		
		Iterator ite1 =liste.iterator();
		
		ite1.next();
		ite1.next();
		ite1.next();
		
		System.out.println(ite1.next());//9 u döndürdü
		ite1.remove();//son döndürdüðü elementi siler. Yani 9 u siler
		System.out.println(liste);
		ite1.next();
		System.out.println(ite1.next());//1
		ite1.remove();//1 i siler
		System.out.println(liste);
	}

}
