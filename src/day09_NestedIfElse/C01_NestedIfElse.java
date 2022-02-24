package day09_NestedIfElse;

import java.util.Scanner;

public class C01_NestedIfElse {

	public static void main(String[] args) {
	/*
	 *Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
    Kullanicidan bir sifre girmesini isteyin
    Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin. Ilk harf A ise   “Gecerli Sifre”     degilse “Gecersiz Sifre” yazdirin.
    Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. Ilk harf z ise   “Gecerli Sifre”     degilse “Gecersiz Sifre” yazdirin.
 	
	 */
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir sifre giriniz");
		char ilkKarakter =scan.next().charAt(0);
		if (ilkKarakter>='A'&& ilkKarakter<='Z') {//buyuk harfleri secmis olacak
			if (ilkKarakter=='A') {
				System.out.println("gecerli sifre");
			} else {
				System.out.println("gecersiz sifre");
			}
			
			
		} else if(ilkKarakter>='a'&& ilkKarakter<='z'){//kucuk harfleri secer

			if (ilkKarakter=='z') {
				System.out.println("gecerli sifre");
			} else {
				System.out.println("gecersiz sifre");
			}
			
			
		}else {//geriye kalan tüm karakterler
			System.out.println("gecerli sifre olması için harf ile başlayın");
		}
		scan.close();
	}

}
