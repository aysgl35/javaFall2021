package day47_Maps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_Maps {

	public static void main(String[] args) {
	//Bir map olusturmadan once, Map e koyacagýmýz Key ve Value degerlerini incelemeliyiz
	//Tum degerleri koyabilmek icin Key ve Value icin Data turunu secerken iyi karar vermeliyiz
	//Data turunu secerken hem icine koyacaðýmýz tum elemanlari kapsayacak bir data turu secmeliyiz
	//hem de icine koydugumuz tum elemanlari isleyebilecek sekilde basit bir data turu secmeliyiz
	
	//Map i olustururken mapin turune de karar vermeyiz HashMap LinkedMap TreeMap gibi
		
		Map<Integer,String> objMap= new HashMap<>();
	//Key=Integer  Value= String þeklinde yaptýk
		objMap.put(101, "Ali, Can, Java");
		objMap.put(102, "Veli, Yan, Java");
		objMap.put(103, "Ali, Yan,C#");
		System.out.println(objMap);//{101=Ali, Can, Java, 102=Veli, Yan, Java, 103=Ali, Yan,C#}
		int no=104;
		String isim="Ayse";
		String soyisim="Can";
		String brans="QA";
		objMap.put(no, isim+","+soyisim+","+brans);
		System.out.println(objMap);
		//{101=Ali, Can, Java, 102=Veli, Yan, Java, 103=Ali, Yan,C#, 104=Ayse,Can,QA}
		//No su 102 olan ogrencinin bilgilirini görelim
		System.out.println(objMap.get(102));//Veli, Yan, Java
		System.out.println(objMap.get(104));//Ayse,Can,QA
		System.out.println(objMap.keySet());//[101, 102, 103, 104]
		System.out.println(objMap.values());
	//[Ali, Can, Java, Veli, Yan, Java, Ali, Yan,C#, Ayse,Can,QA]
		//ogrencilerin isimlerini bir listeye ekleyip yazdýralým
	List<String> valueList=new ArrayList<>(objMap.values());
		//Collection<String> valueList=objMap.values(); böyle de yapabiliriz
		System.out.println(valueList);
		System.out.println(valueList.size());//4
		List<String> isimList=new ArrayList<>();
		String bilgiler[]=new String[3];
		for (int i = 0; i < valueList.size(); i++) {
			bilgiler=valueList.get(i).split(",");
			isimList.add(bilgiler[0]);
			
		}
		System.out.println(isimList);
	}

}
