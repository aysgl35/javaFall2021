package day40_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exception {

	public static void main(String[] args) {
		//verilen bir int array icin
		//kullanicidan sayi isteyin 
		//ve girilen sayiyi index olarak kabul edip
		// o indexdeki elementi yazdirin

		int arr[]= {2,3,4,5,6,7,8,9};
		//ArrayIndexOutOfBoundsException
		//InputMismatcException bu þekilde iki hata verirse aþagýdaki gibi yaparýz
		//problem neyse ona göre cözüm üretilmeli
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("lutfen elementi yazdirmak icin index giriniz");
			int index=scan.nextInt();
			System.out.println("girdiginiz index: "+arr[index]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("girdiginiz index arrayde yok");//ArrayIndexOutOfBoundsException
		}catch(InputMismatchException e) {
			System.out.println("girdiginiz index pozitif tam sayi olmali");//InputMismatcException
		}
		
		
		
		
		
	}

}
