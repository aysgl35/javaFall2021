package _09_Arrays;

import java.util.Arrays;

public class Q10 {

	public static void main(String[] args) {
		/*  you have a string "GayetBasarılı"
	        * with arrays change it to "CoookBasarılı" and write changing array
			*(String iniz: "GayetBasarılı"  Diziyi "CoookBasarılı" ye cevirin )
			*
			*/
		String str="GayetBasarili";
		String arr []=str.split("" );
		System.out.println(Arrays.toString(arr));
		arr [0]="C";
		arr [1]="o";
		arr [2]="o";
		arr [3]="o";
		arr [4]="k";
		//System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			    System.out.print(arr[i]);
		}
		
	}

}
