package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
    /*
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulunuz. Sonucu ekrana yazdırınız.
    */
    	List <String> list = new ArrayList<>();
    	Scanner scan = new Scanner(System.in);
    	System.out.println("listeye atamak icin sayi giriniz \n yeterli sayiya "
    			+ "ula�tiginizda 'q' giriniz");
    	int toplam=0;
    	String islem="";
    		while (!islem.equalsIgnoreCase("q")) {
				System.out.println("sayi giriniz");
				islem= scan.next();
				list.add(islem);
			}
    		list.remove(list.size()-1);//q u silmek icin yazd�k son eleman o cunku
    		System.out.println(list);
    		for (String w : list) {
    			int a=Integer.parseInt(w);
    			toplam+=a*a;
				
			}
    		System.out.println("sayilarin karelirinin toplami : "+toplam);
    scan.close();
    }
}
