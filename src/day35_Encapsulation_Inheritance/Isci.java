package day35_Encapsulation_Inheritance;

public class Isci extends Muhasebe {
	
	protected String statu;
	protected String meslegi;
	protected String Sendika;
	public Isci(){
		System.out.println("Isci paramatresiz constructor calisti");
}
	
	public static void main(String[] args) {
		
		Isci isci1= new Isci();
		isci1.meslegi="Kaynakci";
		isci1.saatUcreti=20;
		isci1.isim="Hasan";
		isci1.maas=isci1.maasHesapa();
		System.out.println(isci1.isim+"in maasi: "+ isci1.maas);
		System.out.println(kartNo); 
		
	}

}
