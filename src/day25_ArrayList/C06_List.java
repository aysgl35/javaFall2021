package day25_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_List {

	public static void main(String[] args) {
		List<String> str = new ArrayList<>();
				str.add("Jeyhun");
				str.add("Yildiz");
				str.add("Mustafa");
				str.add("Tugba");
				str.add("Turgat");
				System.out.println(str);
				String silinecekHarf = "a";
			  killThemAll(str, silinecekHarf);
				System.out.println(killThemAll(str, silinecekHarf));
			}
			private static List<String> killThemAll(List<String> str, String silinecekHarf) {
				for (int i =0 ; i <str.size(); i++) {
					if (str.get(i).contains(silinecekHarf)) {
						str.remove(i);
						
					}
				}
				return str;

	}

}
