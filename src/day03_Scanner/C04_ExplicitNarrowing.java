package day03_Scanner;

public class C04_ExplicitNarrowing {

	public static void main(String[] args) {
		//eger buyuk data turnnedki bir veriyi daha kucuk data turundeki
		//variable a atamak istersek java bunu otomatik olarak yapmaz
		
		int num1=300;
		
		short num2 =(short)num1;
	// esitligin sağı ile solundaki veri turleri farklı oldugundan java mismatch hatasi verir
	//hatayi gidermek icin büyük data turundeki deger'in onune manule onayimizi gosteren 
        // (short) yazilir
	
	System.out.println("num2 : "+num2);
	byte num3 = (byte)num2;
	System.out.println("num3 : "+ num3);
	//deger byte in sinirlarindan buyuk oldugu için java int 300 u kendi yöntemine göre
	//byte a donusturur ve bu arada bizim sayimiz DEGİSİR.
	double num4 = 87.3;
	int num5 = (int)num4;
	System.out.println("num5: "+num5);
	//deger virgullu oldugundan ve int da ondalikli kisim olmadigindan java ondalikli kismi keser
	//dolayisiyla data kaybi olusur
	
	int num6=27;
	int num7=4;
	
	System.out.println(num6/num7);
	//bolme islemi yapılan iki sayi da int olduğu için
	//java sonucu int olarak yazar
	
	double num8 =4;
	System.out.println(num6/num8);//sonucu double olarak yazdırır

	}

}
