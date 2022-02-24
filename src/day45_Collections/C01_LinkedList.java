package day45_Collections;

import java.util.LinkedList;

public class C01_LinkedList {

	public static void main(String[] args) {
	LinkedList<Integer> ll = new LinkedList<>();
	ll.add(5);
	ll.add(7);
	System.out.println(ll);
	//linked listin iki tane interface parent i vardir.
	//birisi list oteki de Deque==>Queue e uzaniyor
	ll.add(0,10);//List interface den gelen ozellikle basa eleman ekleme
	System.out.println(ll);
	ll.addFirst(3);//queue interfaceden gelen ozellikle basa eleman ekleme
	System.out.println(ll);
	LinkedList<Integer> ll2 = new LinkedList<>();
	ll2.addAll(ll);
	System.out.println(ll2);
	ll2.addAll(2,ll2);
	System.out.println(ll2);
	}

}
