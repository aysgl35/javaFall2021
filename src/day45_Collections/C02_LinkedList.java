package day45_Collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C02_LinkedList {

	public static void main(String[] args) {
		List<Integer> ll = new LinkedList<>();
		ll.add(5);
		ll.add(7);
		System.out.println(ll);
		ll.add(9);//data turun List sectigimiz icin sadece List Interfaceindeki methodlari kullanabilir
				  //LinkedList classinda override ettigimiz icin List interface olmasina ragmen List methodlarini kullanabildik
	
	Queue<Integer> ll2 = new LinkedList<>();
	ll2.add(5);
	ll2.add(7);
	ll2.clear();//data turu Queue secince Queue interfaceinden gelen methodlari kullanabildik 
	Deque<Integer> ll3 = new LinkedList<>();
	ll3.add(5);
	ll3.add(7);
	ll3.addLast(20);
	System.out.println(ll3);
	
	}

}
