package day02_Practice;

import java.util.Scanner;

public class C01_Practice {

	public static void main(String[] args) {
		/*
        1.Kullan�c�ya    "Vize s�nav sonucunuzu giriniz :"
        2.vize notu double de�erinde girilecek.
        3. Kullan�c�ya  "Vize s�nav� y�zdesini giriniz". ->> double olmal� ->> 0,40 etkiliyor   !!Y�zde ka� etkiledi�ini Sisteme siz giriyorsunuz.!!
        4.Kullan�c�ya    "Final s�nav sonucunuzu giriniz.
        5. final notu double de�erinde olmal�. (�rn: 65,5)
        6.Kullan�c�ya    "Final s�nav� y�zdesini giriniz"-->> double olmal� ->> 0,60 etkiliyor.
        7. Ornek:Vize final ortalamas�n� bulmak i�in, vize nin y�zde40 �, finalin y�zde60 � al�nmal� ve ��kan sonu�lar toplanmal�d�r.
        8. ��kan sonucu (dersin not ortalamas�n�)   double toplam  ' a e�itleyebilirsiniz.
        todo  :  Ko�ul k�sm�
            e�er ortalamas� 90(90 dahil) 'dan b�y�k ise, harf notu olarak 
            AA, 80(80dahil)   ile 90 aras�nda ise  
            BA, 70(70 dahil)   ile 80 aras�nda ise 
            BB, 60(60dahil) ile 70 aras�nda ise 
            CB, 50(50 dahil) ile 60 aras�nda ise 
            CC, 40(40 dahil) ile 50 aras�nda ise 
            DC, 30(30 dahil) ile 40 aras�nda ise 
            DD, 30 'dan d���k ise FF  gelmeli.
            
         */
	
	Scanner scan = new Scanner (System.in);
	System.out.println("Vize s�nav sonucunu giriniz");
	double vize= scan.nextDouble();
	System.out.println( "Vize s�nav� y�zdesini giriniz");
	double vizeY�zde= scan.nextDouble();
	System.out.println("Final s�nav sonucunuzu giriniz");
	double fnl=scan.nextDouble();
	System.out.println("Final s�nav� y�zdesini giriniz");
	double fnlY�zde=scan.nextDouble();
	double ortalama=(vize*vizeY�zde/100)+(fnl*fnlY�zde/100);
		
	if (ortalama>=90) {
		System.out.println("Ortalaman�z : "+ ortalama+ "\nGecme notunuz : AA");
		
	}else if (ortalama>=80) {
		System.out.println("Ortalaman�z : "+ ortalama+ "\nGecme notunuz : BA");
		
	}else if (ortalama>=70) {
		System.out.println("Ortalaman�z : "+ ortalama+ "\nGecme notunuz : BB");
		
	}else if (ortalama>=60) {
		System.out.println("Ortalaman�z : "+ ortalama+ "\nGecme notunuz : CB");
		
	}else if (ortalama>=50) {
		System.out.println("Ortalaman�z : "+ ortalama+ "\nGecme notunuz : CC");
		
	}else if (ortalama>=40) {
		System.out.println("Ortalaman�z : "+ ortalama+ "\nGecme notunuz : DC");
		
	}else if (ortalama>=30) {
		System.out.println("Ortalaman�z : "+ ortalama+ "\nGecme notunuz : DD");
		
	}else if (ortalama<30) {
		System.out.println("Ortalaman�z : "+ ortalama+ "\nGecme notunuz : FF");	
		
	}
	
	}					
		
		
		
		
		
		
	
		}


