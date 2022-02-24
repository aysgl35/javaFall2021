package day46_Collections;

import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {

	public static void main(String[] args) {
	Deque<String> ciftBasli= new LinkedList<>();
	ciftBasli.add("Veli");
	ciftBasli.add("Ali");
	ciftBasli.addLast("Fatma");//Deque den gelen özellik
	System.out.println(ciftBasli);
	System.out.println(ciftBasli.pop());//Veli sildi ve getirdi
	System.out.println(ciftBasli);//[Ali, Fatma]
	ciftBasli.push("Elif");//basa ekler
	System.out.println(ciftBasli);//[Elif, Ali, Fatma]
	ciftBasli.add(null);
	System.out.println(ciftBasli);

	
	}
}
