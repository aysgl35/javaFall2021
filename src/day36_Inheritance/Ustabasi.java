package day36_Inheritance;

import day35_Encapsulation_Inheritance.Isci;

public class Ustabasi extends Isci {
	Ustabasi(){
		System.out.println("Ustabasi paramatresiz constructor calisti");
	}

	public static void main(String[] args) {
		Ustabasi ust1 = new Ustabasi();
	// javada her class oluşturuldugunda otomatik olarak default constructor oluştugu gibi
	// child class da oluşturulan herbir constructor un ilk satirinda
	//ilk satirinda gizli super() olusturur. 
	}

}
