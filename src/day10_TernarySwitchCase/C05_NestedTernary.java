package day10_TernarySwitchCase;

public class C05_NestedTernary {

	public static void main(String[] args) {
		// Soru: Eger calýsan kadýnsa 60 yasýndan buyuk oldugunda emekli olabilir,
				// calýsan erkekse 65 yasýndan buyukse emeklý olabilir.
	// her seferinde scanner oluþturmak yerine 
	//test datalarimizi variable olarak da oluþturabiliriz
	//ve kod yazýmý bittiðinde bu test datalarýný degistirerek
	//kodlarýmýzý test edebiliriz
	char cinsiyet ='K';
	int yas= 57;
	String sonuc = cinsiyet=='K'? (yas>=60? "Emekli olabilirsin ": "Emekli olamazsin"):
		yas>=65? "Emekli olabilirsin":"Emekli olamazsýn";
		
		System.out.println(sonuc);
		

	}

}
