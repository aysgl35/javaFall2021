package day01_day02_Variables;

public class C02_Variables {

	public static void main(String[] args) {
		
	String okul = "Yıldız Koleji";
	//String okul = "Mehmet Koleji";
	//ayni isim ve degisken turu ile ikinci defa variable oluşturulamaz.
	// int okul =  20;
	//farkli data turu de olsa ayni isim ile ikinci defa variable oluşturulamaz.
	
	okul="Mehmet Koleji";
	//var olan bir variableye yeni bir deger atayabiliriz.
	System.out.println(okul);
	// yazdırma işleminde açıklama istersek 
	// mesela okul adi:Mehmet Koleji yazdiralim
	System.out.println("Okul adi:" + okul);
	}

}
