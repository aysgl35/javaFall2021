package _11_dateTime;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Registration {
	
	ArrayList<User>kullanicilar=new ArrayList<>();//bos list
	
	public List<User>register(){
		Scanner scan=new Scanner (System.in);
		System.out.println("adinizi girinzi");
		String isim=scan.nextLine();
		User user=new User(isim,LocalDateTime.now());
		kullanicilar.add(user);
		return kullanicilar;
		
	}
public void printHappyUsers(List<User> register) {
	for (User each : register) {
		if (each.registerDate.getSecond()<13) {
			System.out.println("sansli kisisiniz "+each.name+" araba kazandiniz");
			
		}else System.out.println("maalesef "+each.name+" kazanamadiniz");
	}
	
}
	public void listele(List<User> register) {
		for (User each : register) {
			System.out.println("Adi: " +each.name+" kayit zamani "+each.registerDate);
		}
		
	}

}
