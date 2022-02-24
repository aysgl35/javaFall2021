package day06_Practice;

public class C03 {

	public static void main(String[] args) {
		// 0-255 e kadar olan harflerin , sayý ve harf deðerini konsola yazdýrýnýz.
		for (int i = 0; i < 256; i++) {
			char harf=(char) i;//
			System.out.println(i+ "--"+harf);
		}
	}

}
