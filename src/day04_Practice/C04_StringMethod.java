package day04_Practice;

public class C04_StringMethod {

	public static void main(String[] args) {
		/*
		Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 */

        String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

       
        char A=pickName.charAt(pickName.indexOf("A"));
        char L=pickName.charAt(pickName.indexOf("L"));
        char I=pickName.charAt(pickName.indexOf("I"));
        System.out.println(A+" "+L+ " "+I);
       

	}

}
