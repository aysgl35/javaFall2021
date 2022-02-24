package day35_Encapsulation_Inheritance;

public class Muhasebe extends Personel {
	protected int saatUcreti;
	protected String statu;
	protected int maas;
	
	public Muhasebe(){
		System.out.println("Muhasebe paramatresiz constructor calisti");
	}
	public static void main(String[] args) {
		Muhasebe clsn1= new Muhasebe();
		clsn1.isim="Ali";
		System.out.println(kartNo);
		
		
		
		
		
		
	}
	public int maasHesapa() {
		int maas=8*25*saatUcreti;
		return maas;
		
	}

}
