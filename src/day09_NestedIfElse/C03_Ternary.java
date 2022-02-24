package day09_NestedIfElse;

public class C03_Ternary {

	public static void main(String[] args) {
		int x=10;
		System.out.println(x%2==0 ? "cift sayi":"tek sayi");
			
		String tekMiCiftMi=x%2==0 ? "cift sayi":"tek sayi";
		System.out.println(tekMiCiftMi);
		System.out.println(x>5?"Aferin":4);
		//String sonuc=x>5?"Aferin":4;
		//eger ternary de donecek sonuclar ayni data turunden 
		//degilse atama yapamayýz,sadece syso ile yazdirabiliriz
	}

}
