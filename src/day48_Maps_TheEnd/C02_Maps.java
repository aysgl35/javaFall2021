package day48_Maps_TheEnd;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class C02_Maps {

	public static void main(String[] args) {
	//Soru 3: Verilen map te istenen prograklama dilini bilen kisileri
	//list olarak donduren bir method yaziniz
	//map{101=Ali,Can,Java, 102=Veli,Yan,Java, 103=Ali, Yan,C#
	//Istenen dil java
	//Sonuc [Ali,Veli]
		
		Map<Integer,String> soruMap = MapOlustur.myMap();//MapOlustur classýndan myMap() metodunundan alýyoruz
		//Standart Map imizi getiriyor 
		String istenenDil="Java";
		System.out.println(dilBilenListesiOlustur(soruMap,istenenDil));
	}

	private static List<String> dilBilenListesiOlustur(Map<Integer, String> soruMap, String istenenDil) {
		List<String> dilBilenListesi = new ArrayList<>();
		//{101=Ali,Can,Java, 102=Veli,Yan,Java, 103=Ali, Yan,C#} keylerden kurtulmam gerekiyor
		//soruMap.values();//bana collection donduruyor keylerden kurtuldum
		
		List<String> valueList=new ArrayList<>(soruMap.values());
		//System.out.println(valueList);//[Ali, Can, Java, Veli, Yan, Java, Ali, Yan, C#]
		//bu üc elemani tek tek ele alýp split ile bolup
		//dil degeri verilen input a esit olanlarýn
		//isim degerlerini dilBilenlerListesi ne ekleyecegim
		
		String parcaliArr[]=new String[3];
		
		for (String w : valueList) {
			parcaliArr=w.split(", ");//"," böyle olursa hata veriyor oradaki bosluk önemli ,bosluk olmalý 
			//[Ali, Can, java] þeklinde 3 elemanli bir array getirecek
			if (parcaliArr[2].equalsIgnoreCase(istenenDil)) {
				dilBilenListesi.add(parcaliArr[0]);
			}
		}
		
		
		return dilBilenListesi;
		
		
	}

}
