package day03_Scanner;

public class C07_PreDecrementPostDecrement {

	public static void main(String[] args) {
	int sayi=10;
	sayi--;
	System.out.println(sayi);
	int a=sayi--;//önce atama sonra azaltma yapar
	System.out.println(a);// a=9 oldu sayi=8 oldu
	System.out.println(sayi);
	System.out.println(--a);//8
	a=--sayi;
	System.out.println(a);
	System.out.println(sayi);

	}

}
