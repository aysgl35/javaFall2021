package day38_Overriding;

public class KumesHayvanlari extends Kuslar {

	public static void main(String[] args) {
		KumesHayvanlari kms1=new KumesHayvanlari();
		kms1.beslenme();//t�m hayvanlar beslenir 
		kms1.hareket();//Kumes hayvanlari yuruyerek hareket eder
		kms1.solunum();//Kuslar akcigerleriyle nefes alir
		Kuslar kms2 = new KumesHayvanlari();
		kms2.beslenme();//Animals==> t�m hayvanlar beslenir 
		kms2.hareket();//Kuslar==> Kumes hayvanlari yuruyerek hareket eder
		kms2.solunum();//Kuslar==> Kuslar akcigerleriyle nefes alir
		//kendi spesifk ozellikleri di�inda kuslara tabi oluyor
		//ama spesifik bir durumu varsa farkini ortaya koyuyor
		
		Kuslar kms3 = new Kuslar();
		kms3.beslenme();//t�m hayvanlar beslenir 
		kms3.hareket();//Kuslar ucarak hareket eder
		kms3.solunum();//Kuslar akcigerleriyle nefes alir
		
		Animals kms4 = new KumesHayvanlari();
		kms4.beslenme();//t�m hayvanlar beslenir 
		kms4.hareket();//Kumes hayvanlari yuruyerek hareket eder
		kms4.solunum();//Kuslar akcigerleriyle nefes alir
		
	}
	public void hareket() {
		System.out.println("Kumes hayvanlari yuruyerek hareket eder");
		
	}
	

}
