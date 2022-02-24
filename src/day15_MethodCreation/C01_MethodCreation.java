package day15_MethodCreation;

import java.util.Scanner;

public class C01_MethodCreation {

	public static void main(String[] args) {
//kullanicidan ismini ve soyismini isteyin
//iki farkli method olusturun methodlardan biri girilen kelimeleri
//ilk harf buyuk, digerleri kucuk olacak sekilde birlestirsin
//ikinci method Isim ve soyismin ilk harfleri buyuk harf,
//kalan harfler * olacak sekilde birlestirsin

//kullaniciya isminin acik olarak yazilmasi veya gizlemsi tercihini
//sorun ve programin kalan ksminda isim ve soyismi kullanicinin istedigi sekilde kullanin 

		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen isim ve soyisminizi girin \nisimden sonra enter'a basin");
		String name=scan.next();
		String surname=scan.next();
		  System.out.println("Isminizin acik sekilde yazilmasini istiyorsani 1 "
	                + "\nIlk harf haric gizli yazilmasini istiyorsaniz 2'e basin");
	        int tercih=scan.nextInt();
	        
	        String birlesmisIsim=null; // Emrah Saglam , E**** S*****
	    
	        if (tercih==1) {
	            birlesmisIsim= acikIsim(name,surname);
	        } else if(tercih==2){
	            birlesmisIsim=isimGizle(name,surname);
	        }else {
	            System.out.println("Lutfen 1 veya 2 secin");
	        }
	        
	        // Bu satirdan itibaren kullanicinin isim ve soyismi kullanici tercihine bagli olarak
	        // kaydedildi
	        
	        System.out.println("kullanicinin tercihi : " + birlesmisIsim);
	  
		//acikIsim(name,surname);	
		//isimGizle(name,surname);
		
		scan.close();
		
		
		
	}

	public static String isimGizle(String name, String surname) {
		name=name.substring(0, 1).toUpperCase() + name.substring(1).replaceAll("\\w", "*");
       surname=surname.substring(0, 1).toUpperCase() + surname.substring(1).replaceAll("\\w", "*");
        
        return name+" "+surname;
	
		
	}

	public static String acikIsim(String name, String surname) {
		
	name=name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
	surname=surname.substring(0,1).toUpperCase()+surname.substring(1).toLowerCase();
		return name+ " "+ surname;
	
		
	}

}
