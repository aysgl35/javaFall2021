package day44_Iterator;

import java.util.ArrayList;
import java.util.List;

public class C01_Iterator {

	public static void main(String[] args) {
		List <Integer> liste=new ArrayList<>();
		liste.add(8);
		liste.add(7);
		liste.add(4);
		liste.add(9);
		liste.add(2);
		liste.add(1);
		System.out.print(liste);

		//index kullanmadan tum elemanlari 3 eklenmis olarak yazdýrýn
		System.out.println();
		for (Integer each : liste) {
			System.out.print(each+3+" ");
		}
		System.out.println();
		System.out.print(liste);
		
	//foreach loop ile index kullanmadan tum elementlere ulasabiliriz ama kalici degisiklik yapamýyoruz
	}

}
