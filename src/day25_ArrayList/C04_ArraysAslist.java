package day25_ArrayList;

import java.util.Arrays;
import java.util.List;

public class C04_ArraysAslist {

	public static void main(String[] args) {
		//verilen arrayi Arrays classından yardım alarak liste çevirebiliriz
		
	String arr[]= {"A","b","C","d"};
	List<String> arraydenList = Arrays.asList(arr);
	System.out.println(arraydenList);
	
	//arraydenList.add("F");
	//System.out.println(arraydenList);//RTE
								// java.lang.UnsupportedOperationException
								//sytax hatasi yok CTE vermez
	//bu şekilde oluşturduğumuz listin boyutu sabit olur dolasiyla add() methodu veya remove() veya clear ()
	//gibi methodları çalıştırırsak yukarıdaki hatayı verir
	
	arr[1]="Z";
	System.out.println("Arrayi degistirtikten sonra, array = "+Arrays.toString(arr));
	System.out.println("Arrayi degistirtikten sonra, arraydenList ="+arraydenList);
	arraydenList.set(3, "D");
	System.out.println("Arrayi degistirtikten sonra, array = "+Arrays.toString(arr));
	System.out.println("Arrayi degistirtikten sonra, arraydenList ="+arraydenList);
	Arrays.sort(arr);
	System.out.println("Arrayi degistirtikten sonra, array = "+Arrays.toString(arr));
	System.out.println("Arrayi degistirtikten sonra, arraydenList ="+arraydenList);
	}	

}
