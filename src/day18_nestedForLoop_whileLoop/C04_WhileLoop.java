package day18_nestedForLoop_whileLoop;

import java.util.Scanner;

public class C04_WhileLoop {

	public static void main(String[] args) {
//not: bu soru for loopla yapýlmasý zor cünkü girilen sayi sayisi belli degil
// kullanicidan toplanmak uzere sayi isteyin
// kullanici sifira basincaya kadar sayilari alip
// toplamaya devap edin
// kullanici sifira bastiginda,
// o ana kadar kac sayi girdigini ve girilen sayilarin toplamini yazdirin

		Scanner scan=new Scanner(System.in);
//loop un icinde kullanacagým obje ve variable lari 
//loop dan önce olusturmak daha güzeldir
//cunku loop un icinde olusturursak,
//loop her dondugunde yeni bir obje veya variable olustur
//ve bu da hafizayi doldurur
		
//toplamý koymak için konteynýra ihtiyac var	
		int sayi=100;//kullanýcidan sayi al bu sayi 0 olamaz kullanici 0 a basarsa kod duracak
		//0 dýþýnda ne olursa olsun önemli deðil
		int toplam=0;//aldýðým sayiyi toplama ekle
		int sayac=0;//kullanýcý her sayi girdiginde sayacak
		while (sayi!=0) {
			System.out.println("lutfen toplama eklemek bir sayi girin");
			sayi=scan.nextInt();
			toplam+=sayi;
			sayac++;
//kullanýcý 0 a basana kadar bu islem devam edecek			
//kullanici 0 a bastiginda loop islevini son kez yapýp
//sonra basa donecek ve loop bitecek
			
			}
		System.out.println("girilen sayilarin adedi :"+ (sayac-1) );//sayac-1 yaptýk 0 ý saymasýn diye
		System.out.println("girilen sayilarin toplamý: "+ toplam);	
}

}
