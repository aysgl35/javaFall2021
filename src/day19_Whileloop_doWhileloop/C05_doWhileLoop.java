package day19_Whileloop_doWhileloop;

public class C05_doWhileLoop {

	public static void main(String[] args) {
//while loop once kontroleder sonra kodu calistirir
//loop icinde artis yapilsa da bir sonraki kontrole kadar
//kod calismaya devam eder
//bu da bazi durumlarda hatali sonuclara ulasmamiza sebep olabilir
//while loop yap�yorsan�z son islemi yap�p yapmak istemdiginiz 
	//iyi d���nmelisiniz
//do while loop ise once islemi yapar ve sonra sarti kontrol eder
//ozellikle kullanicidan deger almalarda do while loop tercih edilir
		int a=0;
	do {
		System.out.print(a +" do �al��t� ");
		a++;
	} while (a>5);//False	

	}

}
