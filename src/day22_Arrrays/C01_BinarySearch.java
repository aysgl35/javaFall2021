package day22_Arrrays;

import java.util.Arrays;

public class C01_BinarySearch {

	public static void main(String[] args) {
	String isimler []= {"Hacer", "ainagul", "Ayse","Hanife"};
	// isimler array inde Murat ismi var mi?
	//array de arama yapmadan once siralama yapmaliyiz
	Arrays.sort(isimler);
	//arrays class i ile sort yaptigimizda array imiz kalici olarak degisir
	
	System.out.println(Arrays.toString(isimler));
	//sort methodu elementleri natural order a gore siralar
	//[Ayse, Hacer, Hanife, ainagul]
	isimler[3]="Ainagul";
	Arrays.sort(isimler);
	System.out.println(Arrays.toString(isimler));
	//[Ainagul, Ayse, Hacer, Hanife]
	System.out.println(Arrays.binarySearch(isimler, "Ayse"));//1
	System.out.println(Arrays.binarySearch(isimler, "Hasan"));//-5
	System.out.println(Arrays.binarySearch(isimler, "Alperen"));//-2
	System.out.println(Arrays.binarySearch(isimler, "Cemal"));//-3
	System.out.println(Arrays.binarySearch(isimler, "Elif"));//-3
	}

}
