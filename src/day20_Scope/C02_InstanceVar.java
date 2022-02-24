package day20_Scope;

public class C02_InstanceVar {
	
	String adres = "Ankara";
	String dogumYeri;
	double notOrtalamasý;
	double yasOrt=12.3;
	char cinsiyet='K';
	char karakter;
	boolean ogrenciMi=true;
	boolean izinliMi;

	public static void main(String[] args) {
		C02_InstanceVar ali =new  C02_InstanceVar();	
		System.out.println(ali.adres);//Ankara
		System.out.println(ali.dogumYeri);//null
		System.out.println(ali.notOrtalamasý);//0.0
		System.out.println(ali.yasOrt);//12.3
		System.out.println(ali.cinsiyet);//K
		System.out.println(ali.karakter);//space
		System.out.println(ali.ogrenciMi);//true
		System.out.println(ali.izinliMi);//false
		ali.staticOlmayanMethod();
	}
	public static void staticMethod() {
	
	}
	public void staticOlmayanMethod() {
		System.out.println(adres);	
	}
}
