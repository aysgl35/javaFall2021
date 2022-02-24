package day31_dateAndTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_LocalTime {

	public static void main(String[] args) {
		LocalTime saat = LocalTime.now();
		System.out.println("baslangic saati"+saat);
		int sayi=10;
		for(int i=0; i<100000; i++) {
			sayi++;
		}
		LocalTime saat1 = LocalTime.now();
	
		System.out.println("bitis saati"+saat1);
		//Eger bir islemin baslangic ve bitis zamanýný kaydetmek istiyorsak
		//en basinda ve en sonunda LocalTime objesi olusturmaliyiz
		double nano=saat.getNano();
		double nano1=saat1.getNano();
		
		System.out.println("For loop "+(nano1-nano)+" nano saniyede tamamlandi");
		System.out.println(saat.getMinute());
		System.out.println(saat.plusMinutes(1000));
		System.out.println(saat.minusHours(20)); 
		LocalTime yerelSaat=LocalTime.now(ZoneId.of("Turkey"));
		System.out.println(yerelSaat);
		
	}

}
