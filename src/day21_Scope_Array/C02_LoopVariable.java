package day21_Scope_Array;

public class C02_LoopVariable {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		int sayi=10;
		for (int i = 0; i <6; i++) {
			String isim="Ali";
		//System.out.println(sayi);//alt� tane 10 yazd�r�r	
		System.out.println(sayi + "  "+ isim);	
		
		
		}
	//System.out.println(isim);
	//System.out.println(i);
	//Loop icerisinde olusturulan variable lar loop d���nda kullan�lamaz
	//Bunun icin loop d���nda da ihtiyacimiz olan bir degisken varsa
	//loop dan once olusturur ve emniyette kalmak icin initialize yapar�z
	for (int i = 0; i < 10; i++) {
		//int sayi=20;//sayi variable i main methodun i�inde olu�turuldugundan
		//tum main methodda gecerlidir, dolayisiyla yeniden ayni isimde bir variable olu�turamazsiniz
		String isim ="Ali";//isim adl� variable l� burda olu�turabilir
							//daha �nce isim variabl� loop i�inde olusturmustuk 
	
	}
	
	
	}

}
