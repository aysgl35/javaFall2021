package day39_Overridding_Polymorphism;

public class C02 extends C01_ {

	public static void main(String[] args) {
		C02 obj1=new C02();
		obj1.privateMethod();//child class private metho
		obj1.staticMethod();//child class static method calisti
		obj1.method();//child method calisti
		C01_ obj2=new C02();
		obj2.finalMethod();//parent class final method
		obj2.staticMethod();//parent class static method calisti
		//child class çalýþmýyor parent class caliyor yani override olmuyor
		//obj2.privateMethoda ulaþamýyoruz. Ulaþamadýðýmýz methodu override edemeyiz
		obj2.method();//child method calisti
	}
	public static void staticMethod(){
		System.out.println("child class static method calisti");

	}

	private void privateMethod () {
		System.out.println("child class private method");
	}
	public void method() {
		System.out.println("child method calisti");//child method calisti
	}
	//public final void finalMethod () {
		//System.out.println("child class final method");
	//final olarak tanýmlanan bir metdod override edelimez demek.
	//}

}
