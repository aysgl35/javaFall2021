package day42_AbstractClasses;

public class AbsUstabasi extends AbsIsci{

	
	//concrete bir child class parent i olan abstract classlardaki tum abstract methodlari implement etmelidir.
	//ama parenti olan abstract classlardaki concrete methodlari implement etmek zorunda degildir.
	public static void main(String[] args) {
	AbsUstabasi ust1=new AbsUstabasi();
	//AbsUstabasi ust2=new AbsIsci(); bu þeklide yazamayýz CTE veriyor AbsIsci() nin altýný ciziyor
	ust1.statu();
	ust1.maas();
	ust1.mesai();
	}

	@Override
	public void mesai() {
		System.out.println("Bu classdaki tum personel ustabasidir. imza ustabasi");
		
	}

	@Override
	public void maas() {
		System.out.println("Ustabaslari aylik 10000 tl maas alir. imza Ustabasi");
		
	}

	@Override
	public void statu() {
		System.out.println("ustabasi ariza durumunda ariza cozulunceye kadar calisir. imza ustabasi");
		
	}

	@Override
	public void abstractMethod() {
		System.out.println("personel classindan geldi");
		
	}

}
