package day04_IncrementDecrement;

public class C02_SwapVariables {

	public static void main(String[] args) {
		/*
		  1- Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP) bir program yaziniz
            Orn : sayi1=10 ve sayi2=20;
            kod calistiktan sonra
            sayi1=20 ve sayi2=10
		 */
		int sayi1 = 10;
		int sayi2 = 20;
		//baslangicta a=10 ve b=20 yazdýralým
		System.out.println("baslangicta sayi1 = "+sayi1 + " baslangicta sayi2 = "+sayi2);
		// ilk önce bos bir variable oluþturalim.
		
		int temp ;
		
		// sayi 2 yi bos variable a atayalim
		
		temp=sayi2;
		
		// sayi2 variable ina sayi1 degerini atayalým
		
		sayi2=sayi1;
		
		// bos variabledaki degeri sayi1 e atayalým
		
		sayi1=temp;
		
		System.out.println("sonuçta sayi1 = "+sayi1 + " sonucta sayi2 = "+sayi2);
		
	}

}
