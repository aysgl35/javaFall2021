package day03_Scanner;

public class C04_ExplicitNarrowing {

	public static void main(String[] args) {
		//eger buyuk data turnnedki bir veriyi daha kucuk data turundeki
		//variable a atamak istersek java bunu otomatik olarak yapmaz
		
		int num1=300;
		
		short num2 =(short)num1;
	// esitligin sa�� ile solundaki veri turleri farkl� oldugundan java mismatch hatasi verir
	//hatayi gidermek icin b�y�k data turundeki deger'in onune manule onayimizi gosteren 
        // (short) yazilir
	
	System.out.println("num2 : "+num2);
	byte num3 = (byte)num2;
	System.out.println("num3 : "+ num3);
	//deger byte in sinirlarindan buyuk oldugu i�in java int 300 u kendi y�ntemine g�re
	//byte a donusturur ve bu arada bizim sayimiz DEG�S�R.
	double num4 = 87.3;
	int num5 = (int)num4;
	System.out.println("num5: "+num5);
	//deger virgullu oldugundan ve int da ondalikli kisim olmadigindan java ondalikli kismi keser
	//dolayisiyla data kaybi olusur
	
	int num6=27;
	int num7=4;
	
	System.out.println(num6/num7);
	//bolme islemi yap�lan iki sayi da int oldu�u i�in
	//java sonucu int olarak yazar
	
	double num8 =4;
	System.out.println(num6/num8);//sonucu double olarak yazd�r�r

	}

}
