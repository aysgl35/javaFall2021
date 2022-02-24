package day03_Scanner;

public class C05_IncrementDecrement {

	public static void main(String[] args) {
		
	// atama iþlemi olursa sayinin degeri kalici olarak deðiþir
	// atama islemi olmadan toplama çýkarma ... islemler sadece o satirda yapilir
	//sayinin degerini kalici olarak degistirmez
		
	int num1=10;
	System.out.println(num1+=5);
	// bu islem num1 in degerini 5 arttirip num1 e assign ediyor
	//dolayisiyla num1 in degeri kalici olarak degisiyor
	System.out.println(num1);//15
	System.out.println(num1+12);//27 kalici olarak DEGÝÞMEZ
	System.out.println(num1);//15
	num1++;
	// her ne kadar = isareti gorunmese de num1++ isleminde assign vardir
	System.out.println(num1);//16
	
	}

}
