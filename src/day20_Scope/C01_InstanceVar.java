package day20_Scope;

public class C01_InstanceVar {
	int notMat=50;
	int notFen;
//instance variable larin scope unda main method yoktur


	public static void main(String[] args) {
	//System.out.println(notMat);//yazd�rmaz
	//��nk� main method static oldugu i�in static
	//olmayan variable lar direk kullan�lamaz veya
	//g�r�nt�lenemez
	//instance variable lara main methoddan ulasmak istersek 
	//obje olustup, obje �zerinden eri�im saglayabiliriz.
	//Scanner scan = new Scanner(System.in)
	//i�inde oldugumuz classdan bir obje olusturalim.
	
	C01_InstanceVar hasan  =new C01_InstanceVar();
	System.out.println("atama yapmadan �nce hasan�n�n notu:" +hasan.notMat);//50
	C01_InstanceVar ayse  =new C01_InstanceVar();
	ayse.notMat=100;
	System.out.println("atama yapt�ktan sonra aysenin notu:" +ayse.notMat);//100
//instance variable larda deger atamazsak java instance olarak
//atanan degeri alir hasan�n notu 50 c�kt�
//ama istersek deger de atayabiliriz 
//bu durumda deger atadigimiz obje icin yeni deger gecerli olur
//aysenin notu 100 ��kt�
	hasan.notMat=90;
	System.out.println("atama yapt�ktan sonra hasan�n�n notu:" +hasan.notMat);//90
	//method2();// methodg static olmadigi i�in main methoddan direkt ca��lamaz
	hasan.method2();// Bu �ekilde �al���r
	}
	public static void staticMethod() {
//System.out.println(notFen); // instance variable lara static methodlardan direkt ula�ilmaz	
}
	public void method2() {
	System.out.println("method2 notFen : "+ notFen);// Bu method static olmadigi icin instance varaible lara ula�ilabilir
	// instance variable olu�turulurken deger atanmasa da olur bu 
	// durumda java default degerler atar
	// int i�in default deger 0'dir
	
	
	}
}
