package day04_IncrementDecrement;

public class C01_Variables {

	public static void main(String[] args) {
	/*
	  * 1- Farkli 3 data turunde variable olusturun ve bunlari yazdirin
		  2- isim ve soyisim icin iki variable olusturun ve bunlari 	
		 		isminiz : Mehmet
		  		soyisminiz : Bulutluoz seklinde yazdirin
		  3- Iki farkli tamsayi data turunde 2 variable
		  olusturun bunlarin toplamini yazdirin
		  4- Bir tamsayi ve bir ondalikli
		  variable olusturun ve bunlarin toplamini yazdirin
		 5 – char data turunde bir variable olusturun ve yazdirin
		  6- Bir tamsayi, bir de char degisken olusturun
		  ve bunlarin toplamini yazdirin.
	 */
	char ilkHarf='S';
	boolean anlasildiMi = true;
	String name = "Ayþe";
	String surname = "GÜNGÖR";
	System.out.println(name+" "+ surname);
	System.out.println("Your name is    : " + name + "\n" + "Your surname is : "  + surname);
	int a = 10;
	short b= 20;
	double c= 30;
	System.out.println(a+b);
	System.out.println(a+ilkHarf);
	System.out.println(a+c);
	//char degiskenler matematiksel isleme sokulursa char degiskenin barindirdigi karakterin 
	// asci degeri isleme girer
	
	}

}
