package day48_Maps_TheEnd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;



public class Soru01 {
//Soru: Verilen bir listedeki tekrar etmeyen elemanlari veren bir method
	//yazýnýz Ornek:Input:Hellooo output[H,e]

	public static void main(String[] args) {
		String str="Hellooo";
	System.out.println(getNonRepeatedChars( str));

	}
	public static List<String>getNonRepeatedChars(String str){
		List<String> list = new ArrayList<>();
		HashMap<String,Integer> map = new HashMap<>();
		String arr[]=str.split("");
		System.out.println(Arrays.toString(arr));
		
		for (String w : arr) {
			map.computeIfPresent(w, (key, value)->value+1);
			map.computeIfAbsent(w, k->1);
			
		}
		System.out.println(map);
		
		for (Entry<String, Integer> w : map.entrySet()) {
			
			if (w.getValue()==1|| w.getValue()==2) {
				list.add(w.getKey());
			}
		}
		return list;
		
	}

}
