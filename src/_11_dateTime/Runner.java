package _11_dateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Runner {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		String islem;
		Registration userReg= new Registration();
		List<User> register=null;
		boolean cikilsinMi=false;
		while(!cikilsinMi) {
			System.out.println("lutfen \n Kisi eklemek icin-->1\n Kisi listelemek icin-->2\n sansli kisi icin-->3\n cikis icin-->4");
			islem=scan.next();
			switch(islem) {
			case"1":
				register=userReg.register();//(ArrayList<User>)bu datacastig e gerek kalmadi kod calisiyor
				break;
			case "2":
				userReg.listele(register);
				break;
			case "3":
				userReg.printHappyUsers(register);
				break;
			case "4" :
				cikilsinMi=true;
			break;
			default:
				System.out.println("yanlis deger girdiniz");
				break;
			}
			
			
			
		}
	    
	}

}
