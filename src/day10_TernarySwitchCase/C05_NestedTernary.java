package day10_TernarySwitchCase;

public class C05_NestedTernary {

	public static void main(String[] args) {
		// Soru: Eger cal�san kad�nsa 60 yas�ndan buyuk oldugunda emekli olabilir,
				// cal�san erkekse 65 yas�ndan buyukse emekl� olabilir.
	// her seferinde scanner olu�turmak yerine 
	//test datalarimizi variable olarak da olu�turabiliriz
	//ve kod yaz�m� bitti�inde bu test datalar�n� degistirerek
	//kodlar�m�z� test edebiliriz
	char cinsiyet ='K';
	int yas= 57;
	String sonuc = cinsiyet=='K'? (yas>=60? "Emekli olabilirsin ": "Emekli olamazsin"):
		yas>=65? "Emekli olabilirsin":"Emekli olamazs�n";
		
		System.out.println(sonuc);
		

	}

}
