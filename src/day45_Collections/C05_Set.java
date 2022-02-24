package day45_Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C05_Set {

	public static void main(String[] args) {
	//Set(interface), matematikteki kume mantigiyla calisir,her element unique dir
	//java elementleri unique yapmak icin HASH ALGORITMASI kullanilir
	//bu bir yigindir indexi yoktur index ile halledebildigimiz seyleri burda halledemeyiz 
	//set in elemanlariný ancak ve ancak iterator ile yapabiliriz foreach ile yazdýrabiliriz.
	//bir kelimenin icindeki ayni harfleri yazdýramayiz ama sildirebiliriz
	//elemanlari birbirine bagli ise LinkedHashSet kullanabilirim
	//elemanlari sýralama yapacaksam TreeSet kullanmaliyim
	//HashSet hizlidir genelde HashSet kullaniriz.
	//en son yazdýrýrken sirali olmasi önemliyse HashSet olarak yapýn yazacaðýnýz zaman bunu
	//TreeSet e aktarýp yazdýrýn size zaman kazandýracaktýr.
		Set<Object>s1=new HashSet<>();
		//data olarak Set yazarýz ama constructor olarak HashSet , LinkedHashSet , TreeSet kullanabiliriz
		//ben eger data type imi Object yaparsam her þeyi yazabilirim.
		s1.add(4);
		s1.add(7);
		s1.add(11);
		System.out.println(s1);
		s1.add("java Candir");
		System.out.println(s1);
		
		List<Object> list =new ArrayList<>();
		list.add(5);
		list.add("java");
		list.add(true);
		list.add('x');
		list.add(s1);
		System.out.println(list);
	//bunu yönetmek, islem yapmak çok zor o yuzden tavsiye edilmez	
		
	}
}
