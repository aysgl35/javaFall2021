package day10_TernarySwitchCase;

public class C11_SMConcat {

	public static void main(String[] args) {
	// String olarak verilen bir degisken + ile baska bir 
	//degiskenle isleme sokulursa JAVA bunlari yan yana
	//ekler. Buna Concatenation denir.
	String isim = "Ali";
	String soyisim="Can";
	System.out.println(isim+" "+soyisim);
	// ayni islemi + sembolu yerine concat methodunu kullanýyoruz
	System.out.println(isim.concat(" ").concat(soyisim));
	}

}
