package day03_Practice;

public class C09_SwitchCase {

	public static void main(String[] args) {
		 // Bugüne göre 100 gün sonra hangi gün olduðunuz yazdýrýnýz.
        // pazartesi haftanin ilk gunu olarak aliniz..
		String gun="pazartesi";
		
		switch (gun.toLowerCase()) {
		case "pazartesi":
			System.out.println("carsamba");
			break;
		case "sali":
			System.out.println("perþembe");
			break;
		case "carsamba":
			System.out.println("cuma");
			break;
		case "persembe":
			System.out.println("cumartesi");
			break;
		case "cuma":
			System.out.println("pazar");
			break;
		case "cumartesi":
			System.out.println("pazartesi");
			break;
		case "pazar":
			System.out.println("sali");
			break;
		default:
			System.out.println("gecerli gun giriniz");
		
		}
        
	}

}
