package _09_Arrays;

import java.util.Arrays;

public class Q09 {

	public static void main(String[] args) {
		/*
        given an int array and find the squares of the elements
        (Verilen bir int dizisi icin elemanlarin karelerini bulun )
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */
		  // ic array leri carp ve carpimlari yeni bir array e ata
        int arr[][]= {{1,2,3},{4,5,6,7},{0,2,1},{2}};   
        int arr2[]=new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
        	arr2[i]=1; 
        	System.out.println(arr2[i]);
        	
            for (int j = 0; j < arr[i].length; j++) {
                
                
                 arr2[i]*=arr[i][j];
                System.out.println(arr[j]);
                
            }
            
            
        }System.out.println(Arrays.toString(arr2));

	}

}
