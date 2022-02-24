package day07_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class C19 {

	public static void main(String[] args) {
		/*
        Girilen bir sayýya kadar olan sayýlardan sadece tek olanlarýný ekrana yazdýrýnýz.
         girilen sayý dahil
        */
		Scanner scan = new Scanner(System.in);
        System.out.println("Yazdirmak istediginiz sayi mikarini yaziniz : ");
        
        
        int tamsayiSayisi = scan.nextInt();
        
        int count=0;
        
        int whilecount =0;
        
        int tamsayi=0;
        
        int count2 =0;
        
        int array[] = new int[tamsayiSayisi];
        
        System.out.println("Simdi sayilarinizi girmeye baslayalim.");
        
        
        while (whilecount < tamsayiSayisi) {
            
            System.out.println("Sayi giriniz :");
            tamsayi = scan.nextInt();
            
            array[whilecount]= tamsayi;
            
            if (tamsayi%2 ==1) {
                
                
                count++;
                
                
            }
            
            whilecount++;
        }
            
            int TEKarray[] = new int[count];
            
            for (int i = 0; i <whilecount ; i++) {
                
                if (array[i]%2 ==1) {
                    
                    TEKarray[count2]= array[i];
                    count2++;
                }
            
                
            }
                
            
            System.out.println(Arrays.toString(array));
            System.out.println(Arrays.toString(TEKarray));
            
        System.out.println(count);
	        		
	}

}
