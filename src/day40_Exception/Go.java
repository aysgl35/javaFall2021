package day40_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Go {

	public static void main(String[] args) {
		FileInputStream fis=null;
		//you may use nested try-catch block
		try {
			fis = new FileInputStream("src/day40/yazi.txt");
			int k =0;
			try {
				while((k=fis.read())!=-1) {
					System.out.print((char)k);
				}
			}catch(IOException e) {
				System.out.println("Dosya okunamiyor");
			}
		}catch(FileNotFoundException e) {
			System.out.println("Dosya silinmis veya dosya yolu hatali");
		}
		
	}

}
