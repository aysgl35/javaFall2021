package day01_day02_Variables;

public class C03_Variables {

	public static void main(String[] args) {
		
	int sayi1 = 10;
	int sayi2= 20;
	
	String sayi3 = "10";
	String sayi4 = "20";
	
	System.out.println(sayi1+sayi2);
	System.out.println(sayi3+sayi4);
	
	String harf1 = "A";
	char harf2 = 'A';
	// Farkl� data turleri ayni degeri alabilir
	//burada �nemli olan bu degiskenleri degisken turune g�re islem yapabilecegimdir.
	
	// yukar�daki degiskenleri kullanarak 30A yazdirin
	
	System.out.println(sayi1+sayi2+harf1);
	System.out.println(harf1+sayi1+sayi2);
	System.out.println(harf1+(sayi1+sayi2));
	System.out.println(sayi1+sayi2+harf2);
	System.out.println(harf2+""+(sayi1+sayi2));
	System.out.println(harf2+""+sayi1+sayi2);
	int a=10;
	int b=20;
	b=a;
	a=b+10;
	System.out.println("a :" +a + " b :"+b);
	}

}
