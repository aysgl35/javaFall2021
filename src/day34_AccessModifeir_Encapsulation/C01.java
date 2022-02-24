package day34_AccessModifeir_Encapsulation;

import day35_Encapsulation_Inheritance.Personel;
import day36_Inheritance.Memur;

public class C01 {
	private  int sayiPrivate=10;//private class üyelerine sadece icinde bulundugu classtan ulaþabilirsin
	 int sayiDefault=20;//default class üyelerine sadece icinde bulunduðu package dan ulaþilabilir
	protected  int sayiProtected=30;//protected class üyerine içinde bulunduðu package dan ve baþka package daki 
	//child classlardan ulaþabiliriz
	public  int sayiPublic=40;
	//public class uyerine tüm package lardaki tum classlardan ulaþilabilir
	public static void main(String[] args) {
		C01 obj=new C01();
		System.out.println(obj.sayiPrivate);
		System.out.println(obj.sayiDefault);
		System.out.println(obj.sayiProtected);
		System.out.println(obj.sayiPublic);
		
	}
	public void staticOlmayanMethod() {
		C01 obj=new C01();
		System.out.println(obj.sayiPrivate);
		System.out.println(obj.sayiDefault);
		System.out.println(obj.sayiProtected);
		System.out.println(obj.sayiPublic);
		
	}

}
