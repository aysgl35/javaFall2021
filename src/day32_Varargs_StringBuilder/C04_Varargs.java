package day32_Varargs_StringBuilder;

import java.util.Arrays;

public class C04_Varargs {

	public static void main(String[] args) {
		isimler("ayse","elif");
		topla(5,8,10,13,15,2);
		//varargsdan once farli parametreler kullanilabilir
		//ama varargsdan sonra parametre yazilamaz
		//yazarsaniz CTE verir java sizi varargs son olmali diye uyarýr
	
	
	
	}

	private static void isimler(String...isimler) {
		System.out.println(isimler[isimler.length-1]);
		for (String str : isimler) {
			System.out.print(str+ " ");
		}
	}

	private static void topla(int... sayilar){
		int toplam=0;
		for (int each : sayilar) {
			toplam+=each;
			
		}
		System.out.println();
		System.out.println("sayilarin toplami="+toplam);

	}

}
