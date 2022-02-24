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
	//set in elemanlarin� ancak ve ancak iterator ile yapabiliriz foreach ile yazd�rabiliriz.
	//bir kelimenin icindeki ayni harfleri yazd�ramayiz ama sildirebiliriz
	//elemanlari birbirine bagli ise LinkedHashSet kullanabilirim
	//elemanlari s�ralama yapacaksam TreeSet kullanmaliyim
	//HashSet hizlidir genelde HashSet kullaniriz.
	//en son yazd�r�rken sirali olmasi �nemliyse HashSet olarak yap�n yazaca��n�z zaman bunu
	//TreeSet e aktar�p yazd�r�n size zaman kazand�racakt�r.
		Set<Object>s1=new HashSet<>();
		//data olarak Set yazar�z ama constructor olarak HashSet , LinkedHashSet , TreeSet kullanabiliriz
		//ben eger data type imi Object yaparsam her �eyi yazabilirim.
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
	//bunu y�netmek, islem yapmak �ok zor o yuzden tavsiye edilmez	
		
	}
}
