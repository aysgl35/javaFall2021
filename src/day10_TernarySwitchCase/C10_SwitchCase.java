package day10_TernarySwitchCase;

public class C10_SwitchCase {

	public static void main(String[] args) {
	// verilen sayiyi inceleyin
	//Girilen sayi
	//10 ise "Ýki basamakli en kucuk sayi"
	//100 ise "uc basamakli en kucuk sayi"
	//1000 ise "dort basamakli en kucuk sayi"
	//diger durumlarda "Girdigin sayiyi degistir" yazdirin
	
		int a = 1000;
		switch (a) {
		case 10 :
			System.out.println("Ýki basamakli en kucuk sayi");
			break;
		case 100 :
			System.out.println("Uc basamakli en kucuk sayi");
			break;
		case 1000 :
			System.out.println("Dort basamakli en kucuk sayi");
			break;
		default:
			System.out.println("Girdigin sayiyi degistir");
		}

	}

}
