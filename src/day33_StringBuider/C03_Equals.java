package day33_StringBuider;

public class C03_Equals {

	public static void main(String[] args) {
		StringBuilder sb1=new StringBuilder ("tava");
		StringBuilder sb2=new StringBuilder ("java");
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		
		System.out.println(sb1.compareTo(sb2));
		//ilk farkli karakterlere bakiyor farki yaziyor
	String str="Java";
	//System.out.println(sb1==str);
	//== sb ile Stringi karþýlaþtýramaz
	System.out.println(sb1.equals(str));//false
	//farli objeler oldugu için ayni olma ihtimali yok
	//System.out.println(sb1.compareTo(str));
	//compareTo String için kullanilamaz diyor
	//System.out.println(sb1=="Java");
	//java kabul etmedi
	System.out.println(sb1.equals("java"));//false
	//System.out.println(sb1.compareTo("java
	System.out.println(str=="Java");
	}

}
