package day18_nestedForLoop_whileLoop;

import java.util.Scanner;

public class C04_WhileLoop {

	public static void main(String[] args) {
//not: bu soru for loopla yap�lmas� zor c�nk� girilen sayi sayisi belli degil
// kullanicidan toplanmak uzere sayi isteyin
// kullanici sifira basincaya kadar sayilari alip
// toplamaya devap edin
// kullanici sifira bastiginda,
// o ana kadar kac sayi girdigini ve girilen sayilarin toplamini yazdirin

		Scanner scan=new Scanner(System.in);
//loop un icinde kullanacag�m obje ve variable lari 
//loop dan �nce olusturmak daha g�zeldir
//cunku loop un icinde olusturursak,
//loop her dondugunde yeni bir obje veya variable olustur
//ve bu da hafizayi doldurur
		
//toplam� koymak i�in konteyn�ra ihtiyac var	
		int sayi=100;//kullan�cidan sayi al bu sayi 0 olamaz kullanici 0 a basarsa kod duracak
		//0 d���nda ne olursa olsun �nemli de�il
		int toplam=0;//ald���m sayiyi toplama ekle
		int sayac=0;//kullan�c� her sayi girdiginde sayacak
		while (sayi!=0) {
			System.out.println("lutfen toplama eklemek bir sayi girin");
			sayi=scan.nextInt();
			toplam+=sayi;
			sayac++;
//kullan�c� 0 a basana kadar bu islem devam edecek			
//kullanici 0 a bastiginda loop islevini son kez yap�p
//sonra basa donecek ve loop bitecek
			
			}
		System.out.println("girilen sayilarin adedi :"+ (sayac-1) );//sayac-1 yapt�k 0 � saymas�n diye
		System.out.println("girilen sayilarin toplam�: "+ toplam);	
}

}
