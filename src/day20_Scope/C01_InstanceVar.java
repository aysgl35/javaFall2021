package day20_Scope;

public class C01_InstanceVar {
	int notMat=50;
	int notFen;
//instance variable larin scope unda main method yoktur


	public static void main(String[] args) {
	//System.out.println(notMat);//yazdýrmaz
	//çünkü main method static oldugu için static
	//olmayan variable lar direk kullanýlamaz veya
	//görüntülenemez
	//instance variable lara main methoddan ulasmak istersek 
	//obje olustup, obje üzerinden eriþim saglayabiliriz.
	//Scanner scan = new Scanner(System.in)
	//içinde oldugumuz classdan bir obje olusturalim.
	
	C01_InstanceVar hasan  =new C01_InstanceVar();
	System.out.println("atama yapmadan önce hasanýnýn notu:" +hasan.notMat);//50
	C01_InstanceVar ayse  =new C01_InstanceVar();
	ayse.notMat=100;
	System.out.println("atama yaptýktan sonra aysenin notu:" +ayse.notMat);//100
//instance variable larda deger atamazsak java instance olarak
//atanan degeri alir hasanýn notu 50 cýktý
//ama istersek deger de atayabiliriz 
//bu durumda deger atadigimiz obje icin yeni deger gecerli olur
//aysenin notu 100 çýktý
	hasan.notMat=90;
	System.out.println("atama yaptýktan sonra hasanýnýn notu:" +hasan.notMat);//90
	//method2();// methodg static olmadigi için main methoddan direkt caðýlamaz
	hasan.method2();// Bu þekilde çalýþýr
	}
	public static void staticMethod() {
//System.out.println(notFen); // instance variable lara static methodlardan direkt ulaþilmaz	
}
	public void method2() {
	System.out.println("method2 notFen : "+ notFen);// Bu method static olmadigi icin instance varaible lara ulaþilabilir
	// instance variable oluþturulurken deger atanmasa da olur bu 
	// durumda java default degerler atar
	// int için default deger 0'dir
	
	
	}
}
