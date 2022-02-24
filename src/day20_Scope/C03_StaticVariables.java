package day20_Scope;

public class C03_StaticVariables {
	static int no=20;
	static int sayi;
	static String adres="Ýzmir";
	static boolean aktifMi=true;
	static boolean tatildeMi;


	public static void main(String[] args) {
//Static variablelara main methoddan direkt ulaþilabilir		
		System.out.println(no);//
		no++;
		System.out.println(no);//21
		staticMethod();
		
		C03_StaticVariables  obje = new C03_StaticVariables();
		obje.staticOlmayanMethod();
		System.out.println("no un son hali: "+no);
		 
	}
 public static void staticMethod() {
	 //burdan static variable lara direkt ulasýlabilir
	 sayi++;
	 no++;
	 System.out.println("static methodda sayi: "+ sayi);
	System.out.println("static methodda no : "+no);
}
 public void staticOlmayanMethod() {
	no++;
	System.out.println("static olmayan methodda no :" +no);
}
}
