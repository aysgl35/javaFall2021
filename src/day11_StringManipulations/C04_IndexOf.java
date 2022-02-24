package day11_StringManipulations;

public class C04_IndexOf {

	public static void main(String[] args) {
		String str="Calisirsaniz, Java ogrenmek cok kolay";
		
		System.out.println(str.indexOf('s'));//4
		System.out.println(str.indexOf('j'));//14
		
		int index = str.indexOf("r");//6
		// indexof() methodu bize her zaman int bir deger doner
		System.out.println(index);
		System.out.println(str.indexOf('q'));//-1 doner
		//Bir String icinde olmayan bir karakter veya kelime ararsak java
		//-1 sonucunu dondurur
		
		System.out.println(str.indexOf('A'));//-1
		System.out.println(str.indexOf("Java"));//14
		System.out.println(str.indexOf('a',18));
		System.out.println(str.length());
		
		
		
	}

}
