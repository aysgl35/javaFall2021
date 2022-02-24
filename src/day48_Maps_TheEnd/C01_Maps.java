package day48_Maps_TheEnd;

import java.util.HashMap;
import java.util.Map;

public class C01_Maps {

	public static void main(String[] args) {
	//Soru 1: Verilen bir String deki harfleri ve harflerin kacar kez kullnildigini 
	//return eden bir method yazýnýz
	//Ornek: Input:  Hellooo output: H=1 e=1 l=2 o=3
		String input="Hellooo";
		
		Map<String,Integer>mainMap= harfSay(input);
		System.out.println(mainMap);

	}

	private static Map<String,Integer> harfSay(String input) {
		Map<String,Integer> harfSayilariMap=new HashMap<>();
		String inputArr[]=input.split("");//[H,e,l,l,o,o,o]
		
		for (String w : inputArr) {
			if (!harfSayilariMap.containsKey(w)) {
				harfSayilariMap.put(w, 1);
			}else {
				//harfSayilariMap.get(w)+1 bu girilen harfin value sunu bulup 1 artirir
				harfSayilariMap.put(w, harfSayilariMap.get(w)+1);
			}
		}
		return harfSayilariMap;
		
		
	}

}
