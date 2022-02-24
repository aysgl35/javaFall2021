package day43_Interface;

public class C03_Concrete implements C02_Interface {

	public static void main(String[] args) {
		C03_Concrete obj= new C03_Concrete();
		obj.motor();
		obj.kaporta();
		System.out.println("obj ile sayi= "+obj.sayi);
		C02_Interface.sanzuman();
		System.out.println("class ismi ile sayi= "+C02_Interface.sayi);
	// interface de default keyword kullanarak olusturdugumuz body si olan methodlara
	//child concrete class lardan obje vasitasiyla ulasabilirim.
	
	//interface de static keyword kullanarak olusturdugumuz body si olan methodlara
	//chil concrete classlardan interface ismi vasitasiyla ulasabilirim.

	}
//bir interfacede static veya default keyword kullanarak bodysi olan bir method olusturursak 
//bu interface e implements eden concrete child classlar bu methodlari 
//implement etmek zorunda degildir
	@Override
	public void motor() {
		System.out.println("motor methodu calisti");
		
		
	}

}
