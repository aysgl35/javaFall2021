package day10_TernarySwitchCase;

public class C09_SwitchCase {

	public static void main(String[] args) {
// Harf olarak girilen notu rakama cevirelim
		char not ='A';
		switch (not) {
		case 'A' :
			System.out.println("85-100 arasi");
			break;
		case 'B' :
			System.out.println("60-85 arasi");
			break;
		case 'C' :
			System.out.println("50-60 arasi");
			break;
		case 'D' :
			System.out.println("40-50 arasi");
			break;
		case 'F' :
			System.out.println("40'dan kucuk");
			break;
		default:
			System.out.println("Gecerli not giriniz");
		}

	}

}
