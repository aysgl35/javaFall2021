package day25_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C03_Sort {

	public static void main(String[] args) {
		List<String> isimler = new ArrayList<>();
		isimler.add("ilmehan");
		isimler.add("Hasan");
		isimler.add("Ayse");
		isimler.add("Alperen");
		isimler.add("Cemal");
		isimler.add("Elif");
		Collections.sort(isimler);
		System.out.println(isimler);
	}
}
