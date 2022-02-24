package day45_Collections;

import java.util.LinkedList;

public class C03_LinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(5);
		ll.add(7);
		System.out.println(ll);
		System.out.println(ll.peek());//silmeden ilk elemani bana getirir
		System.out.println(ll.peekFirst());//silmeden ilk elemani bana getirir
		LinkedList<Integer> ll2 = new LinkedList<>();
		System.out.println(ll2.peekFirst());//deque 
		System.out.println(ll2.peek());//queue
		System.out.println(ll.element());//5//silmeden ilk elemaný getirir yoksa exception fýrlatýr
		//System.out.println(ll2.element());//NoSuchElementException
		
		System.out.println(ll.poll());//5
		System.out.println(ll);//[7]
		System.out.println(ll.poll());//7
		System.out.println(ll);//[]
		System.out.println(ll.poll());//null
		
		System.out.println(ll.hashCode());//1 java nin verdigi hash code u doner
		ll2.add(8);
		System.out.println(ll2.hashCode());//39
		ll2.offer(10);
		System.out.println(ll2);//[8, 10]
		System.out.println(ll2.hashCode());//1219
		System.out.println(ll2.offer(3));//true
		ll2.push(2);//addFirst gibi caliþir
		System.out.println(ll2);//[2, 8, 10,3]
	}

}
