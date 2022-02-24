package day32_Varargs_StringBuilder;

public class C05_StringBuilder {

	public static void main(String[] args) {
		String str = "Ali Can";

		String str2= new String("Veli Cem");


		StringBuilder sb = new StringBuilder("Yasasin Java");

		sb.append("!!!");

		System.out.println(sb); 

		sb.toString().toUpperCase();

		System.out.println(sb); 
		
		System.out.println(sb.toString().toUpperCase());


	}

}
