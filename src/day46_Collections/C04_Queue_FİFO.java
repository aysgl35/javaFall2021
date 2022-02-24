package day46_Collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class C04_Queue_F�FO {

	public static void main(String[] args) {
		Queue<String> kuyruk= new LinkedList<>();
		//sadece Queue methodlarini kullanmak icin data t�r�n� Queue sectik
		//Gelen sona gelir, silinen bastan silinir
		//Buna FIFO denir First In First Out ilk gelen ilk gider
		//unique degildir istedigin kadar ayni elemandan ekleyebilirsiniz
		kuyruk.add("Karanfil");
		kuyruk.add("Papatya");
		kuyruk.add("G�l");
		System.out.println(kuyruk);//[Karanfil, Papatya, G�l]
		kuyruk.remove();
		System.out.println(kuyruk);//[Papatya, G�l]
		kuyruk.remove();
		System.out.println(kuyruk);//[G�l]
		kuyruk.add("G�l");
		kuyruk.add("G�l");
		kuyruk.add(null);
		kuyruk.add(null);
		System.out.println(kuyruk);//[G�l, G�l, G�l, null, null]
		
	}

}
