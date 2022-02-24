package day46_Collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class C04_Queue_FÝFO {

	public static void main(String[] args) {
		Queue<String> kuyruk= new LinkedList<>();
		//sadece Queue methodlarini kullanmak icin data türünü Queue sectik
		//Gelen sona gelir, silinen bastan silinir
		//Buna FIFO denir First In First Out ilk gelen ilk gider
		//unique degildir istedigin kadar ayni elemandan ekleyebilirsiniz
		kuyruk.add("Karanfil");
		kuyruk.add("Papatya");
		kuyruk.add("Gül");
		System.out.println(kuyruk);//[Karanfil, Papatya, Gül]
		kuyruk.remove();
		System.out.println(kuyruk);//[Papatya, Gül]
		kuyruk.remove();
		System.out.println(kuyruk);//[Gül]
		kuyruk.add("Gül");
		kuyruk.add("Gül");
		kuyruk.add(null);
		kuyruk.add(null);
		System.out.println(kuyruk);//[Gül, Gül, Gül, null, null]
		
	}

}
