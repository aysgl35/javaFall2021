package day11_StringManipulations;

public class C03_Length {

	public static void main(String[] args) {
		String str1="Ali Kahyaoglu";
		System.out.println(str1.length());//13
		System.out.println(str1.charAt(str1.length()-1));// ne yazarsan�z yaz�n
		//son harfi verir cunku length-1 son harfin indexi
		
		String str2 ="";
		System.out.println(str2.length());//0
		
		String str3 = null;
		//System.out.println(str3.length();//hata verir deger atanmad��� i�in
		
		String str4;
		System.out.println(str3);// null 
		//System.out.println(str4);// hata veririr deger hic atanmad��� i�in
		// null pointer olu�turdugumuz fakat sonra kullanacagimiz bir Stringi
		//isaretlemek icin kullanilir
		//Bir String i yazdirdigimizda null cikiyorsa turkce olarak "Ben bu
		//degiskeni olusturdum ama henuz deger atamadim demek istiyor
		//Eger Stringi olusturur ama deger atamazsak yazdirdigimizda hata aliriz
		
		
		
		
	}

}
