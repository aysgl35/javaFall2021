package day38_Overriding;
class ParentClass{
	int sayi =10;
	public  void Detail(String temp) {
		System.out.println("Derived class "+temp + " "+ sayi);
	}
}
public class S01 extends ParentClass{
	int sayi1=13;
	public void getDetails (String temp) {
		System.out.println("Test class "+temp+sayi1);
		
	}
	
	public static void main(String[] args) {
		S01 obj = new S01();
		
		obj.Detail("GFG");
		obj.getDetails("Ayse");
		
		
		

	}

}
