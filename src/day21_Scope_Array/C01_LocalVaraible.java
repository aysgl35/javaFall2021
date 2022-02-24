package day21_Scope_Array;

public abstract class C01_LocalVaraible {
	String okulIsmi;// burasý class level butun locallerde kullanabilirim

	public static void main(String[] args) {
		//Java local variable lara default deger atamaz
		//kodlarýmýzda sorun yaþamamak için olusturdugumuz local
		//variable lara uygun bir deger atamamizda fayda var

		int sayi=0;//int sayi; dersek Java CTE veriyor
		System.out.println(sayi);
		
		//int sayi; //bir local de ayni isimde birden fazla variable oluþturulamaz
		//String sayi; //buna da izin vermez sayi=20; dedigimiz zaman data türü degisik olsa bile hangi sayi
					//oldugunu java bilemediginden buna izin vermez
		
		@SuppressWarnings("unused")
		String isim="Ali";
		
	}
	public static void staticMethod() {
		//sayi;// farkli localde olusturulan variable methodlarýn
			 //static olup olmamasýna baðlý olmaksýzýn farklý localde kullanilmaz
		@SuppressWarnings("unused")//farkýndayým isim variable lý kullanmadým demek
		String isim="Veli";// java isim adlý variable ye izin veriyor çünkü
							//locoller farklý
	
	}
}
