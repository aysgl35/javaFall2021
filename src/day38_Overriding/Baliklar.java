package day38_Overriding;



public class Baliklar extends Animals{
	public static void main(String[] args) {
		Baliklar balik1=new Baliklar();
		balik1.beslenme();
		balik1.solunum();
		balik1.hareket();
		
		
	}
	@Override
	//child classdaki bir method parent classdan bir methodu override ediyorsa
	//bunu istersek @Override notasyonu ile deklare edebilirz
	//deklare etmesek de kodlarimiz calisir
	//Ancak deklare ettigimizde java overriden methodu surekli kontrol eder
	//ve o medhodda overridinge uymayan bir degisiklik olursa CTE verir
	public void hareket() {
		System.out.println("Baliklar yuzerek hareket eder");
		
	}
	public void solunum(){
		System.out.println("Baliklar solungaclariyla nefes alir");
		
}
}
