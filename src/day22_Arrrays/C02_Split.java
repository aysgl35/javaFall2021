package day22_Arrrays;

import java.util.Arrays;

public class C02_Split {

	public static void main(String[] args) {
	//Java ogrenmek çok guzel 
	//cumlesinin kelimelerini ters sirada yazdirin
	
	
	String cumle="Java ogrenmek çok guzel";
	String kelimeler []= cumle.split(" ");
	System.out.println(Arrays.toString(kelimeler));
	
	for (int i =  kelimeler.length-1; i>=0; i--) {
		System.out.print(kelimeler [i]+ " ");
		
	}

	}

}
