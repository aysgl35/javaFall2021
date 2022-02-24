package _12_Varargs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q02 {
	public static void main(String[] args) {
		         // verilen int lerden ilki haric tum sayilari toplayan ve
				// buldugunuz toplam ile ilk sayiyi carpip sonucu yazdiriniz.
		
		topla(2,4,5,6,7,8,2);//2*32
		topla(3,4,5,6,7,8,2);//3*32

	}
	public static void topla(int carpilacakSayi, int...toplanacakSayilar) {
		int toplam=0;
		for (int i : toplanacakSayilar) {
			toplam+=i;
		}
		//int sonuc=carpilacakSayi*toplam;
		System.out.println("sonuc="+carpilacakSayi*toplam);
	}
}
