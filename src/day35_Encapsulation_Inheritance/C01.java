package day35_Encapsulation_Inheritance;

public class C01 {

	private double not =49.9;
	private boolean gecerMi=false;
	private static int kart=123;
	
	
	public boolean isGecerMi() {
		return gecerMi;
		//data turu boolean olunca get methodu is ile baslar
	}
	public void setNot(double not) {
		this.not = not;
	}
	public static int getKart() {
		return kart;
	}
	public static void setKart(int kart) {
		C01.kart = kart;
	}
	
	

}
