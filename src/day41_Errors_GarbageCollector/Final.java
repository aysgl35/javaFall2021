package day41_Errors_GarbageCollector;

public final class Final {
	//final class PARENT class OLMAZ
	//final class child class olur
	public static void main(String[] args) {
	System.out.println(C03_Final.pi);
	//C03_Final.pi=4.13;//final yaptýk artýk degerini degistiremiyoruz
	System.out.println(C03_Final.pi);
	String m="Ali Can";
	String n=null;
	String p="";
	
	System.out.println(p.length());//0
	System.out.println(m+n);//Ali Cannull

	}

}
