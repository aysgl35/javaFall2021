package day05_MatematikselIslemler;

public class C01_MatematikselIslemler {

	public static void main(String[] args) {
	System.out.println(4*(2+5)/2);//14
	System.out.println(4*(2+5)/3);//9 b�t�n rakamlar int oldu�u i�in sonuc int oldu.
	System.out.println(4*(2+5)/3.6);//7.777777777777778 double sayi oldu�u i�in sonuc double oldu
	  // sonucu virgullu yazdirmak istersek
    
    double sonuc=4*(2+5)/3 ;
    
    
    System.out.println(sonuc); // 9.0
    
    sonuc= (double)(4*(2+5)/3) ;
    
    
    System.out.println(sonuc); // 9.0
    
    
    sonuc=(double)4 * (2+5)/3 ;
    
    System.out.println(sonuc); // 9.333333333333334
    
    sonuc=4 * (2+5)/(double)3 ;
    
    System.out.println(sonuc); // 9.333333333333334
    
    
    int sayi1=5;
    int sayi2=2;
    double sayi3=2;
    
    
    System.out.println(sayi1/sayi2); // 5/2=2
    
    System.out.println(sayi1/sayi3); // 5/2=2.5
    
    System.out.println(sayi1+sayi3/sayi2); // 6.0
	
	
	}

}
