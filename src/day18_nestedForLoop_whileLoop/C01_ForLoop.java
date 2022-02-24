package day18_nestedForLoop_whileLoop;

import java.util.Iterator;
import java.util.Scanner;

public class C01_ForLoop {

	public static void main(String[] args) {
	//kullanicidan 2 tam sayi isteyin
	//ilk sayidan baslayarak, ikinci sayiya kadar ucer,ucer yazdirin
		//(ikinci sayi dahal olmak zorunda degil)
		Scanner scan = new Scanner(System.in);
        System.out.println("iki sayi giriniz");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        if (num1>num2) {//azalarak gidecek
        	for (int i = num1; i >= num2; i-=3) {
        		System.out.print(i+ " ");
				
			}
			
		} else if(num1<num2) {//artarak
			for (int i = num1; i <= num2; i+=3) {
				System.out.print(i+ " ");
			}

		}else {
			System.out.println("girilen sayilar esit");
		scan.close();	
		}
        
       
        
	}

}
