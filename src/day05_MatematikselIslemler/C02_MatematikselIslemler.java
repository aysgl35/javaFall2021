package day05_MatematikselIslemler;

public class C02_MatematikselIslemler {

	public static void main(String[] args) {
		int num1=10;
		int num2=20;
		String str1="Ali";
		String str2 ="Can";
		System.out.println(num1+num2+str1);//30Ali
		System.out.println(str1+num1+num2);//Ali1020
		System.out.println(str1+(num1+num2));//Ali30
		System.out.println(num1*num2+str1);//200Ali
		System.out.println(str1+num1*num2);//Ali200
		//çarpma olduðu için öncelik tanýdý
	}

}
