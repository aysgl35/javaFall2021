package day32_Varargs_StringBuilder;

public class C03_Varargs {

	public static void main(String[] args) {
		kafanaGoreIslem(5,10,13,0);
		//Varrags'da hic eleman olmasa da java itiraz etmez.
		//once int olarak tanimlanan sayilari eslestirir
		//kalan tum sayilari varargs a doldurur
	}

	private static void kafanaGoreIslem(int sayi1, int sayi2,  int...sayilar) {
		int toplam=0;
		for (int each : sayilar) {
			toplam+=each;
		}
		System.out.println("ikinci sayi ile int varargs toplaminin carpim sonucu :"+sayi2*+toplam);
	}


	}


