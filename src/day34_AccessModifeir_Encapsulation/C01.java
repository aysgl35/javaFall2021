package day34_AccessModifeir_Encapsulation;

import day35_Encapsulation_Inheritance.Personel;
import day36_Inheritance.Memur;

public class C01 {
	private  int sayiPrivate=10;//private class �yelerine sadece icinde bulundugu classtan ula�abilirsin
	 int sayiDefault=20;//default class �yelerine sadece icinde bulundu�u package dan ula�ilabilir
	protected  int sayiProtected=30;//protected class �yerine i�inde bulundu�u package dan ve ba�ka package daki 
	//child classlardan ula�abiliriz
	public  int sayiPublic=40;
	//public class uyerine t�m package lardaki tum classlardan ula�ilabilir
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
