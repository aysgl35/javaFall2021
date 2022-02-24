package day37_Inheritance;

public class Corolla extends Toyota {
	String renk;
	int fiyat;
	boolean elektrikliMi;
	int tekerSayisi=4;
	String uretimYeri="Turkiye";
	
	public static void main(String[] args) {
//Obje oluþtururken constructorý takip et
	//class üyesi bulmak icin data türene bak
		Corolla                  arb1               =             new          	Corolla();
//Class ismi && Data turu	   obje ismi        assignment		keyword			Constructor
		//javada obje oluturdugumuz her class ismi ayni zamanda bir data turudur.
		//Bu ornegigmiz icin Corolla hem class adi hem de olusturdugumuz arb1 objesinin data taypeidir.
		System.out.println(arb1.calisiyorMu);
		System.out.println(arb1.tekerSayisi);
		System.out.println(arb1.uretimYeri);
		Toyota arb2 = new Corolla();
		System.out.println(arb2.calisiyorMu);
		System.out.println(arb2.tekerSayisi);
		
		Araba arb3 = new Corolla();
	
		System.out.println(arb3.calisiyorMu);
	
	
		String str = new String ("Filiz");

	}

}
