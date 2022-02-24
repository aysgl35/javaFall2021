package practiceKitapYonetimi;

import java.util.List;
import java.util.Scanner;

public class KitapMethod {
	static Scanner scan = new Scanner(System.in);
	static int kitapNo=1000;

	 public static void menu(List<Kitap>liste) {
	    	System.out.println("========= KÝTAP PROGRAMI =============\n1: Kitap ekle\n2: Numara ile kitap sil\n3: Tum kitaplari listele\n4: Bitir");
	    	System.out.println("isleminizi seciniz : ");
	    	int tercih =scan.nextInt();
	    	switch(tercih) {
	    	case 1:
	    		kitapEkle(liste);
	    		break;
	    	case 2 :
	    		noIleSil(liste);
	    		break;
	    	case 3 :
	    		Listele(liste);
	    		break;
	    	case 4 :
	    		bitir();
	    		break;
	    	default:
	    		System.out.println("yanlis giris yapildi tekrar deneyiniz!!!");
	    		break;
	    	}
	    	
	    }
		private static void Listele(List<Kitap> liste) {
			for (Kitap k : liste) {
				System.out.println(k.toString());
			}
			menu(liste);
		}
		private static void noIleSil(List<Kitap> liste) {
			System.out.println("silinecek kitap no giriniz");
			int silinecekNo=scan.nextInt();
			for (Kitap k : liste) {
				if (k.getNo()==silinecekNo) {
					liste.remove(k);
					menu(liste);
					
				}
				
			}
			System.out.println(silinecekNo + "kitap bulunamadi");
			menu(liste);
		}
		public static void kitaplarEkle(List<Kitap> liste) {
			Kitap kitap1=new Kitap(++kitapNo,"Sefiller","Victor Hugo",1890,100);
			Kitap kitap2=new Kitap(++kitapNo,"Sefiller","Victor Hugo",1890,100);
			Kitap kitap3=new Kitap(++kitapNo,"Sefiller","Victor Hugo",1890,100);
			liste.add(kitap1);
			liste.add(kitap2);
			liste.add(kitap3);
			
		
		}
		
		private static void kitapEkle(List<Kitap> liste) {
			System.out.println("Kitap ismi giriniz : ");
			String kitapAdi=scan.nextLine();
			scan.nextLine();//dummy -->kukla bos scan obj
			System.out.println("Yazar adi giriniz");
			
			String yazarAdi=scan.nextLine();
			System.out.println("Yayin yili giriniz");
			int yayinYili=scan.nextInt();
			System.out.println("fiyatini giriniz");
			double fiyat=scan.nextDouble();
			Kitap kitap =new Kitap(++kitapNo,yazarAdi,yazarAdi, yayinYili,fiyat);
			liste.add(kitap);
			System.out.println(kitap.toString() + " eklendi");
			menu(liste);
		}
		private static void bitir() {
			System.out.println("yine bekleriz...");
			
}
		}
