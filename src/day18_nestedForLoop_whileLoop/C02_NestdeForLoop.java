package day18_nestedForLoop_whileLoop;

import java.util.Scanner;

public class C02_NestdeForLoop {

	public static void main(String[] args) {
	// kullanicidan 10'dan kucuk pozitif bir tamsayi girmesini
	//isteyin girdigi sayiya gore aþagidaki sekli yazdirin
	//output:1
		//   1 2
		//   1 2 3
		
		Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 10 dan kucuk sayi giriniz");
        int num = scan.nextInt();	
        for (int satir =1; satir <=num; satir++) {
        	for (int i = 1; i<=satir; i++) {
        		System.out.print(i +" ");
				
			}
        	 System.out.println("");
		}
       scan.close();
	}

}
