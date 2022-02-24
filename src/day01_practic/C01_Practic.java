package day01_practic;

public class C01_Practic {

	public static void main(String[] args) {
		// Write a Java program to break an integer into a sequence of individual digits.
		// Hint: use / and %
		// ex: input: 12345
//		    output: 1
//		            2
//		            3
//		            4
//		            5
		int num = 12345;
		int birler = num%10;
		int onlar = (num/10)%10;
		int yüzler = (num/100)%10;
		int binler = (num/1000)%10;
		int onBinler=(num/10000);
		System.out.println(onBinler+"\n"+binler+"\n"+yüzler+"\n"+onlar+"\n"+birler);
		

	}

}
