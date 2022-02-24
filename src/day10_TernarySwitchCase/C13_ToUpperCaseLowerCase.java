package day10_TernarySwitchCase;

import java.util.Locale;

public class C13_ToUpperCaseLowerCase {

	public static void main(String[] args) {
	String isim="aLI";// bunu Ali olarak yazdiralim
	System.out.println(""+isim.toUpperCase().charAt(0)+isim.toLowerCase().charAt(1)+
			isim.toLowerCase().charAt(2));
	// turkce lokal harfler kullanarak tamamýný kucuk harfe cevirelim
	System.out.println(isim.toLowerCase(Locale.CANADA_FRENCH));
	System.out.println(isim.toLowerCase(Locale.US));
	}

}
