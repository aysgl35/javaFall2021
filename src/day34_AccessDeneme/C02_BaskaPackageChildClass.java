package day34_AccessDeneme;

import day34_AccessModifeir_Encapsulation.C01;

public class C02_BaskaPackageChildClass extends C01 {

	public static void main(String[] args) {
		
		C02_BaskaPackageChildClass obj=new C02_BaskaPackageChildClass();
		//System.out.println(obj.sayiPrivate);
		//System.out.println(obj.sayiDefault);
		System.out.println(obj.sayiProtected);
		System.out.println(obj.sayiPublic);
		obj.access();
		//protected e bu child classtan ulaþabiliyoruz
	}
	
	public  void access() {
		//System.out.println(sayiPrivate);
		//System.out.println(sayiDefault);
		System.out.println(sayiProtected);
		System.out.println(sayiPublic);
		
	}

}
