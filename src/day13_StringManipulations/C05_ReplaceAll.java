package day13_StringManipulations;

public class C05_ReplaceAll {

	public static void main(String[] args) {
		String cumle ="java     cok           zevkli";
		cumle=cumle.replaceAll("\s+", " ");//\\s+
		System.out.println(cumle);
		System.out.println(cumle.replaceAll("[a-z]", "")); 
		System.out.println(cumle);
		System.out.println(cumle.replaceAll("\\S", "*"));
		System.out.println(cumle.replaceAll("\\s", "*"));
		String str="*Java 98ogrenmek c..ok k876olay";
		str=str.replace(".", "");
		str=str.replaceAll("\\d", "");
		str=str.replace("*", "");
		str=str.replaceAll("\\W", " ");
		System.out.println(str);
		
		
	}

}
