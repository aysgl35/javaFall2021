package day39_Overridding_Polymorphism;

public class C01_ {

	public static void staticMethod(){
		System.out.println("parent class static method calisti");

	}
	private void privateMethod () {
		System.out.println("parent class private method");
	}
	public final void finalMethod () {
		System.out.println("parent class final method");
	}
	public void method() {
		System.out.println("parent method calisti");
	}
//child class ile parent class ayni packageda olduklarýndan 
//methodlarýn access madifierlari public protected veya default olsaydi hic bir sorun olmazdi
//final bu method son hali demek bundan sonra degistiremezsiniz demek. Yani override edilemez.
}
