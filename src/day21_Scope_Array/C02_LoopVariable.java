package day21_Scope_Array;

public class C02_LoopVariable {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		int sayi=10;
		for (int i = 0; i <6; i++) {
			String isim="Ali";
		//System.out.println(sayi);//altý tane 10 yazdýrýr	
		System.out.println(sayi + "  "+ isim);	
		
		
		}
	//System.out.println(isim);
	//System.out.println(i);
	//Loop icerisinde olusturulan variable lar loop dýþýnda kullanýlamaz
	//Bunun icin loop dýþýnda da ihtiyacimiz olan bir degisken varsa
	//loop dan once olusturur ve emniyette kalmak icin initialize yaparýz
	for (int i = 0; i < 10; i++) {
		//int sayi=20;//sayi variable i main methodun içinde oluþturuldugundan
		//tum main methodda gecerlidir, dolayisiyla yeniden ayni isimde bir variable oluþturamazsiniz
		String isim ="Ali";//isim adlý variable lý burda oluþturabilir
							//daha önce isim variablý loop içinde olusturmustuk 
	
	}
	
	
	}

}
