package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // Bir ogretmenden girmek istedigi kadar notu alýnýz, ve
        // ortalamayý gecen ogrenci sayýsýný bulunuz.
    	
    	List <Integer> listNotlar= new ArrayList<>();
    	
    	Scanner scan = new Scanner(System.in);
    	String devam;
    		do {
    			
    			System.out.println("lutfen notlari giriniz");	
				int ogrnot =scan.nextInt();
				System.out.println("devam mý : E/H");
				devam=scan.next();
				listNotlar.add(ogrnot);
				
				
			} while (devam.equalsIgnoreCase("E"));
    		//ortalama hesaplanmasi
    		int toplam=0;
    		for(int i= 0; i<listNotlar.size();i++ ) {
    		toplam+=listNotlar.get(i);
    		}
    		
    double ortalama= toplam/listNotlar.size();
    int ortalamayiGcenSayisi=0;
    for (int i = 0; i < listNotlar.size(); i++) {
		if (listNotlar.get(i)>ortalama) {
			ortalamayiGcenSayisi++;
		}
	}
    
    System.out.println("girilen notlarin ortalamas: "+ ortalama );
    System.out.println("ortalamayi gecen ogr sayisi: "+ ortalamayiGcenSayisi);
    
scan.close();
    }
}
