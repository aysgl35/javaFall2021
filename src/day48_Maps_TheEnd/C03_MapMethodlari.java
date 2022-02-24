package day48_Maps_TheEnd;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class C03_MapMethodlari {

	public static void main(String[] args) {
	Map<Integer,String>ornek=MapOlustur.myMap();
	
	System.out.println(ornek);
	System.out.println(ornek.containsKey(110));//false
	System.out.println(ornek.containsKey(101));//true
	System.out.println(ornek.containsValue("java"));//false
	System.out.println(ornek.containsValue( "Ali, Yan, C#"));//true 
	Set<Entry<Integer, String>>enrtrySet= ornek.entrySet();//burdaki her bir eleman entry data türü entry degeri de söyle 101=Ali, Can, java gibi
	
	// burdaki her bir elemani for each le yazdirabilirim
	int sayac=1;
	for (Entry<Integer, String> w : enrtrySet) {
		System.out.println(sayac +".entry: "+w);
		sayac++;
	}
	System.out.println(ornek.getOrDefault(110, "girilen key map'de yok"));
	System.out.println(ornek.getOrDefault(102, "girilen key map'de yok"));
	ornek.putIfAbsent(103, "Ali, Yan, C#");//key e bakiyor key varsa koruyor eklemiyor
	ornek.putIfAbsent(110, "Fikri, Tan, Qa");
	sayac =1;
	for (Entry<Integer, String> w : enrtrySet) {
		System.out.println(sayac +".entry: "+w);
		sayac++;
	}
	String maptenString=ornek.toString();
	System.out.println(maptenString);
	}
}
