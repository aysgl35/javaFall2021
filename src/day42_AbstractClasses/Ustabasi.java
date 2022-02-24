package day42_AbstractClasses;

public class Ustabasi extends Isci {
	
	public void statu() {
		System.out.println("Bu classdaki tum pesonel ustabasidir. imza ustabasi");
	}
	
	public void maas() {
		System.out.println("Ustabaslari aylik 10000 tl maas alir. imza ustabasi");
	}
	public void mesai() {
		System.out.println("ustabasi ariza durumunda ariza cozulunceye kadar calisir. imza ustabasi");
	}
	//obje olusturdugumuz en alttaki class parent classlardaki özellikleri ya da methodlari 
	//override edince, classdan olusturulan objeler en doðru ve spesifik özelliklere kavustu
	
	//ama klasik parent-child iliskisinde tum methodlari ovveride etme mecburiyeti yoktur.
	//java parent classlardaki tum methodlari override etmek mecburiyeti kazandýrmak icin abstract class yapisini olusturmustur
	//Yani bir classi abstract olarak tanimlarsaniz child classlar tum methodlari override etmek zorunda kalir.
	//Dolayisiyla obstract yaptigimiz parent classlar sadece kalip görevi yapacaklar
	public static void main(String[] args) {
		
		Ustabasi ust1 = new Ustabasi();
		ust1.statu();
		ust1.maas();
		ust1.mesai();
	}

}
