package day35_Encapsulation_Inheritance;

public class C02_Setter {
	
	public static void main(String[] args) {
	C01 ogr1= new C01();
	C01 ogr2= new C01();
	System.out.println(ogr1.isGecerMi());
	ogr1.setNot(60);
	// setter() methoduyla notu degistirebiliriz ama yazdýramayiz 
	ogr1.setKart(134);
	System.out.println(ogr2.getKart());
	}

}
