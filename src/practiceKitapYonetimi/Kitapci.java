package practiceKitapYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
	1.	Kullanicinin Kitap ekleme, silme ve listeleme gibi
		islemleri yapmasina imkan taniyan bir uygulama yaziniz.

	2.	Program, kitaplara 1001 den baslayarak sirali ve otomatik numara vermeli.
		Bunun yaninda, her bir kitap icin Kitap Adi, Yazar Adi, Yayin Yili ve Fiyat gibi bilgiler girilebilmelidir.

	3.	Programin baslangicinda Kullaniciya asagidaki gibi bir menü sunulmakdir.
		Kullanici programi bitirene kadar islemlere devam edebilmelidir.

		========= KÝTAP PROGRAMI =============
			1: Kitap ekle
			2: Numara ile kitap sil
			3: Tüm kitaplari listele
			4: Bitir

 */
public class Kitapci {
	static List<Kitap>kitapListe=new ArrayList<>();
	//static Scanner scan = new Scanner(System.in);
	//static int kitapNo=1000;

    public static void main(String[] args) {
    	//menu(kitapListe);
    	
    	KitapMethod.kitaplarEkle(kitapListe);
    	KitapMethod.menu(kitapListe);
    }
    /*public static void menu(List<Kitap>liste) {
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
		*/
	}
//}

