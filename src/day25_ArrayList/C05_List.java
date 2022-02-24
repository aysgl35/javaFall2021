package day25_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_List {

	public static void main(String[] args) {
	//verilen bir listede icinde belirli bir harf olan elamanlarý
	//silen bir method yazýnýz
	
	List<String> str = new ArrayList<>();
	str.add("Mesut");
	str.add("Zeynep");
	str.add("Tuba");
	str.add("Kemal");
	str.add("Kerim");
	str.add("aysel");
	str.add("ayla");
	str.add("arif");
	System.out.println(str);
	String silinecekharf="a";
	str= killThemAll(str, silinecekharf);
	
	
	}

	private static List<String> killThemAll(List<String> str, String silinecekharf) {
		for (int i = 0; i < str.size(); i++) {
			if (str.get(i).contains(silinecekharf)) {
				str.remove(i);
				i--; // eleman silinince bizde indexi bir küçülttük
					// silme yoksa index de küçülmeyecek
			}
			
		}
		
		System.out.println(str);
		
		return str;
		
		
	}

}
