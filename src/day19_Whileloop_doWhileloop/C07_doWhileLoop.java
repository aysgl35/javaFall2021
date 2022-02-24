package day19_Whileloop_doWhileloop;

import java.util.Scanner;

public class C07_doWhileLoop {

	public static void main(String[] args) {
/*Soru 5 ) Kullanicidan bir sifre girmesini isteyin.
 *  Girilen sifreyi asagidaki sartlara gore kontrol edin ve 
 *  sifredeki hatalari yazdirin.
 Kullanici gecerli bir sifre girinceye kadar 
 bu islemi tekrar edin ve gecerli sifre girdiginde 
 “Sifreniz Kabul edilmistir” yazdirin.
 - Sifre kucuk harf icermelidir
 - Sifre buyuk harf icermelidir
 - Sifre ozel karakter icermelidir
 - Sifre en az 8 karakter olmalidir.
 * 
 */
Scanner scan = new Scanner(System.in);
String sifre="";
boolean khk=false;
boolean bhk=false;
boolean okk=false;
boolean uk=false;

do {
	System.out.println("lutfen sifrenizi girin");
	 sifre=scan.nextLine();
	khk=kucukHarfKontrol(sifre);
	bhk=buyukHarfKontrol(sifre);
	okk=ozelKarakterKontrol(sifre);
	uk=uzunlukKontrol(sifre);
	
} while (!khk || !bhk ||!okk ||!uk);

	System.out.println("sifreniz basarýlý bir þekilde kaydedildi");	
	scan.close();
	}

	public static boolean uzunlukKontrol(String sifre) {
	boolean uk=false;
	if (sifre.length()>=8) {
		uk=true;
		
	} else {
		System.out.println("sifreniz en az 8 karakter olmalý");
	}
	
		return uk;
		
		
	}

	public static boolean ozelKarakterKontrol(String sifre) {
		boolean okk=false;
		 String harfler="!@#$%^&*()_-+=/?<,>.|";
	        for (int i = 0; i <sifre.length(); i++) {
	            
	            if (harfler.contains(sifre.substring(i,i+1))) {
	                okk=true;
	                break; 
	            }       
	        }
	        
	        if (!okk) {
	            System.out.println("Sifreniz en az bir ozel karakter icermelidir");
	        }
	        
	        
	        return okk;
		
		
	}

	public static boolean buyukHarfKontrol(String sifre) {
			boolean bhk=false;
			String harfler="ABCDEFGHIJKLMNOPRSTUVYZWQX";
			for(int i= 0; i<sifre.length(); i++) {
				if (harfler.contains(sifre.substring(i,i+1))) {
					bhk=true;
					break;
					
				}
				}
			
				if (!bhk) {
					System.out.println("Sifreniz en az bir kucuk harf icermelidir");
					
				}
					return bhk;
	}

	public static boolean kucukHarfKontrol(String sifre) {
		boolean khk=false;
	String harfler="abcdefghijklmneoprstuvyzwqx";
	for(int i= 0; i<sifre.length(); i++) {
	if (harfler.contains(sifre.substring(i,i+1))) {
		khk=true;
		break;// break kullanmamizin sebebi : soruda 1 tane kucuk harf olmasi yeterli
        //  biz kucuk harfi bulduktan sonra kodu durdurmazsak
        // sonradan karsimiza cikacak Buyuk harfler bizi yaniltir
		
	}
	}
//for loop bittikten sonra   // bu satira geldigimde sifrede kucuk harf varsa khk=true, hic kucuk harf yoksa khk=false
	if (!khk) {
		System.out.println("Sifreniz en az bir kucuk harf icermelidir");
		
	}
		return khk;
	}
		
		
		
	}


