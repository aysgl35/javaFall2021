package day21_Scope_Array;

public abstract class C01_LocalVaraible {
	String okulIsmi;// buras� class level butun locallerde kullanabilirim

	public static void main(String[] args) {
		//Java local variable lara default deger atamaz
		//kodlar�m�zda sorun ya�amamak i�in olusturdugumuz local
		//variable lara uygun bir deger atamamizda fayda var

		int sayi=0;//int sayi; dersek Java CTE veriyor
		System.out.println(sayi);
		
		//int sayi; //bir local de ayni isimde birden fazla variable olu�turulamaz
		//String sayi; //buna da izin vermez sayi=20; dedigimiz zaman data t�r� degisik olsa bile hangi sayi
					//oldugunu java bilemediginden buna izin vermez
		
		@SuppressWarnings("unused")
		String isim="Ali";
		
	}
	public static void staticMethod() {
		//sayi;// farkli localde olusturulan variable methodlar�n
			 //static olup olmamas�na ba�l� olmaks�z�n farkl� localde kullanilmaz
		@SuppressWarnings("unused")//fark�nday�m isim variable l� kullanmad�m demek
		String isim="Veli";// java isim adl� variable ye izin veriyor ��nk�
							//locoller farkl�
	
	}
}
