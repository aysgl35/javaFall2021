package day17_ForLoops;

import java.util.Iterator;

public class C07_NestedForLoop {

	public static void main(String[] args) {
	// 1 den 4 e kadar sayilari yan yana 
	//aralar�nda bir bo�luk birakarak yazd�r�n
		for(int satir=1; satir<6; satir++) {
		
		for (int i=0; i <satir; i++) {
	
			System.out.print("*");
		}
		System.out.println(" ");
			}

	}

}
