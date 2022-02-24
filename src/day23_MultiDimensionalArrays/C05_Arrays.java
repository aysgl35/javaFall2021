package day23_MultiDimensionalArrays;

import java.util.Arrays;

public class C05_Arrays {

	public static void main(String[] args) {
//Soru 5) Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin
String cumle = "Her sey, javayla kolay";

String kelimeler[]=cumle.split(" ");
System.out.println(Arrays.toString(kelimeler));

System.out.println("Girilen cumlede "+ kelimeler.length+ " adet kelime var");

	
	
	}
	
	

}
