package day34_AccessDeneme;

import day34_AccessModifeir_Encapsulation.C01;

public class C01_BaskaPackage {

	public static void main(String[] args) {
		C01 obj=new C01();
		//System.out.println(obj.sayiPrivate);
		//System.out.println(obj.sayiDefault);
//default sadece ayni pacgace dekiler ulasabilir
		//System.out.println(obj.sayiProtected);
//protected ayni packagedaki classlar ve child classlar ulaþabilir		
		System.out.println(obj.sayiPublic);

	}

}
