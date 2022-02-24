package day25_ArrayList;

import java.util.Arrays;
import java.util.List;

public class C04_ArraysAslist {

	public static void main(String[] args) {
		//verilen arrayi Arrays class�ndan yard�m alarak liste �evirebiliriz
		
	String arr[]= {"A","b","C","d"};
	List<String> arraydenList = Arrays.asList(arr);
	System.out.println(arraydenList);
	
	//arraydenList.add("F");
	//System.out.println(arraydenList);//RTE
								// java.lang.UnsupportedOperationException
								//sytax hatasi yok CTE vermez
	//bu �ekilde olu�turdu�umuz listin boyutu sabit olur dolasiyla add() methodu veya remove() veya clear ()
	//gibi methodlar� �al��t�r�rsak yukar�daki hatay� verir
	
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
