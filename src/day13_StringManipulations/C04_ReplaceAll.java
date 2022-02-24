package day13_StringManipulations;

public class C04_ReplaceAll {

	public static void main(String[] args) {
		String str ="Java 98Ogrenmek c..ok k876olay";
		//replaceAll methodlari kullanarak Java ogrenmek cok kolay
	str=str.replaceAll("\\d", "");
	System.out.println(str);
	str =str.replaceAll("\\s", "x");
	System.out.println(str);
	str=str.replaceAll("\\W", "");
	System.out.println(str);
	str=str.replaceAll("x", " ");
	System.out.println(str);
	}

}
