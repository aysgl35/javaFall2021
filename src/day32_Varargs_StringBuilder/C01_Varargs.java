package day32_Varargs_StringBuilder;

public class C01_Varargs {

	public static void main(String[] args) {
		topla(5,8,10,13,15,0);
		//varargs list gibi davranir ama 
		//array methodlari ile calisir
	}

	private static void topla(int... sayilar){
		int toplam=0;
		for (int each : sayilar) {
			toplam+=each;
			
		}
		System.out.println("sayilarin toplami="+toplam);
	}

}
