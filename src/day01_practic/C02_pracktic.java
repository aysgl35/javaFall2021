package day01_practic;

public class C02_pracktic {

	public static void main(String[] args) {
		/*
		  \n (or \r): starts from a new line : metni bir alt satırdan itibaren yazdırır.
		          \t:  horizontal tab : metni yatayda 1 tab miktarı kaydırır.
		          \\: prints a back slash :\ (ters slash) yazdırır
		          \': prints single quote :' tek tırnak yazdırır.
		          \": prints double quote :"" Çift tırnak yazdırır.
	​
		 */
		 
		 	//  Soru-1 :   konsola      "Hello ", "World  \ /"        seklinde yazdırınız

		System.out.println("\"Hello \", \"Word \\ / \"");
		// Soru-2 : Pazartesi kelimesini her harfini ayrı bir satira gelecek sekilde yazdırınız.
		System.out.println("P\na\nz\na\nr\nt\ne\ns\ni");
		//Soru-3 : "Java" ile hayat cok 'afilli'   yazdırınız
		
		System.out.println("\"Java\" ile hayat çok \'afilli\'");
		
		 //Soru-4 : "Basari" gayrete
	      // 'asiktir'  yazdırınız sonraki "TechProEd ile java cok kolay ..." ifadesi  
		//3 satır sonra ve satır basından 1 tab ilerideyazılsın.
		System.out.println("\"Başari\" gayrete \n\'asiktir\'\n\n\n\t\"TechProEd ile java cok kolay ...\"");
	}

}
