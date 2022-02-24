package _09_Arrays;

import java.util.Arrays;
import java.util.Iterator;

public class Q18 {
    public static void main(String[] args) {
        // kullanıcıdan alınan bir  String'deki herbir  karakterin adedini bir array içinde yazdıran bir java programı yazın.
        // String  "Javacilar cook afilli" ise cevap şöyle olmalıdır:
        // { =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}

    	String str= "Javacilar cook afilli";
    	int count[] = new int[256];
    	 
        int len = str.length();
 
        // Initialize count array index
        //Say� dizi dizinini ba�lat
        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;
 
        // Create an array of given String size
        //Verilen Dize boyutunda bir dizi olu�turun
        char ch[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {
 
                // If any matches found
            	//Herhangi bir e�le�me bulunursa
                if (str.charAt(i) == ch[j])
                    find++;
            }
 
            if (find == 1)
                System.out.print(" " +str.charAt(i)
                    + "=" +count[str.charAt(i)]);
			}
			
		}
    		

    	

    }

