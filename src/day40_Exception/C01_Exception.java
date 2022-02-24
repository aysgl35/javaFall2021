package day40_Exception;

public class C01_Exception {

	public static void main(String[] args) {
		int a=20;
		int b=0;
	// try catch birlikte kullanilir	
		
		try {//sorun cikmazsa yapacaðý islemi burada yaziyoruz
			System.out.println("sayilarin bolumu: "+a/b);
		}catch(ArithmeticException e) {//ArithmeticException e beklenen exception turu burda e isim onun yerine
			//ne yazarsanýz yazýn o size kalmis. e varaible ismi gibi. e. dedigimizde aþagýdaki gibi methodlar gelir
			//beklenen exception turu gerceklestiginde calisacak kodlar
			System.out.println("sifira bolum yapilamaz");
			//System.out.println(e.getMessage());// /by zero exception in kaynagini
			e.printStackTrace();
		
		}
		System.out.println("Görev tamamlandi");
		//package in üstüne gel New File i sec yazi.txt  dosyasi bu þekilde oluþuyor
	}

}
