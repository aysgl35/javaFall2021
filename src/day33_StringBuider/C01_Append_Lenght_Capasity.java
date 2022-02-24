package day33_StringBuider;

public class C01_Append_Lenght_Capasity {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder ();
		System.out.println(sb.length());//0
		System.out.println(sb.capacity());//16
// uzunluðunu belirtmezsek 16 karakter uzunlukta StringBuilder oluþturuyor
		StringBuilder sb1=new StringBuilder (7);
		sb1.append("Elif");
		System.out.println(sb1.length());//4
		System.out.println(sb1.capacity());//7
		
		StringBuilder sb2=new StringBuilder ("java candir");
		System.out.println(sb2.length());//11
		System.out.println(sb2.capacity());//27
		StringBuilder sb3=new StringBuilder ();
		sb3.append("Hasan");
		sb3.append(" candir ");
		System.out.println(sb3.length());//12
		System.out.println(sb3.capacity());//16
		sb3.append("canýmsin",0,3);
		System.out.println(sb3);
		
	}

}
