package day19_Whileloop_doWhileloop;

import java.util.Iterator;

public class C06_doWhileLoop {

	public static void main(String[] args) {
//Soru 2) 'm' harfinden baslayarak 'c'harfine kadar tum harfleri yazýn

	for (char i = 'm'; i >'c'; i--) {
		//i--;//l j h f d 
		System.out.print(i+ " "); 
		//i--;//m k i g e 
	}
	System.out.println("");
//***************** while loop ile ***************************
	char krk='m';
	while (krk>'c') {
		System.out.print(krk + " ");
		krk--;
		
	}
	System.out.println("");
//******************do while loop ile *******************
	char harf='m';
	do {
		System.out.print(harf+ " ");
		harf--;
		
	} while (harf>'c');
		
		
	}

}
