package day43_Interface;

public interface C02_Interface {
	//Interface bir class degildir. 
	//java bize abstraction icin iki secenek sunar full abstract methodlar varsa bu interface dir.
	//interface icinde concrete methodlar bulunmaz 
	//interface de constructor yoktur
	//tum alanlari doldurulmak zorunda olan bir sablon gibidir
	//Concrete classlari interface deki tum metodlari implement etmek zorunda birakir
	//Nasil yapilacagina degil ne yapilacagina odaklanir
	//bir class birden fazla classa extend edilmez ama birden fazla interface e implement edilebilir
	
	//protected void motor();
	//illegal modifier for the interface method motor; only public, private, abstract, default, static and strictfp are permitted
	void motor();
	//normal class larda access modifer yazmazsaniz java default access mo.kabul eder.
	//�NTERFACE de ise access modifier yazmazsaniz java PUBL�C olarak kabul eder
	
	int sayi =10; // sayi ismini koyu tonda italik yazd� yani bunu final ve static olarak kabul etti
	//interface icindeki variableler mutlaka public, static ve final olmalidir. Private veye protected variablelar compile time error verir
	/*int SAY�1=10;
	public int SAY�2=20;
	public static int SAY�3=30;
	public static final int SAY�4=40;*/
	//Yukaridaki farkli yazilimlar interface icin ayni seylerdir. Yani java ister yazin ister yazmayin hepsini public static final olarak kabul eder
	
	//Interface icindeki variablelari mutlaka initialize etmek zorundasiniz, aksi takdirde CTE alirsiniz
	//in a =12; gibi yaplasininiz yani mutlaka atama yapmalisiniz
	public static void sanzuman() {
		System.out.println("static keywordu ile body olu�turabildim");
	} 
	public default void kaporta() {
		System.out.println("default keyword sayesinde body olusturabildim.");
		
	} //burdaki default access modifier degil, javanin interface icin ozel kabul ettigi bir keywordur.
	//interface lerde bodysi olan method olu�turulamiyordu ama java8 ve uzeri versiyonlarda bu opsiyon eklenmis
	// bu methodlar concrete degil ama body si var.
	//bir methodun basina default veya static yazarsan�z ona body ekleyebilirsiniz. Body kullanmak onu concrete etmiyor.
}
