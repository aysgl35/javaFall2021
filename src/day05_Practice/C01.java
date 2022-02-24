package day05_Practice;

import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

public class C01 {

	public static void main(String[] args) {
	System.out.println("*****ATM'ye hos geldiniz*******");
	Scanner scan=new Scanner(System.in);
	System.out.println("yapmak istedigimiz islemi seciniz");
	String islem=" 1.islem : BAKÝYE \n 2.islem : PARA CEKME "
			+ "\n 3.islem: PARA YATIRMA \n 4. islem : CIKIS";
	System.out.println(islem);
	int bakiye =5000;
	String secilenIslem=scan.nextLine();
	
	switch (secilenIslem) {
	case "1":
		System.out.println("bakiyeniz : "+bakiye);
		
		break;
	case "2":
		System.out.println("cekeceginiz miktari giriniz ");
		int cekilecekMiktar=scan.nextInt();
		if (cekilecekMiktar<=bakiye) {
			bakiye-=cekilecekMiktar;
			System.out.println("yeni hesap bakiyeniz : "+bakiye);
			
		}else {
			System.out.println("yetersiz bakiye");
		}
		break;
	case "3":
		System.out.println("yatirilacak miktari giriniz ");
		int yatirilacakMiktar=scan.nextInt();
		bakiye+=yatirilacakMiktar;
		System.out.println("yeni bakiyeniz: "+ bakiye);
		break;
	case "4":
		System.out.println("cikis isleminiz basari ile yapildi");
		break;
	
	default:
		System.out.println("hatali islem yaptiniz");
		break;
	}
		
		
		

	}

}
