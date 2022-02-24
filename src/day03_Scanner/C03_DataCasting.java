package day03_Scanner;

public class C03_DataCasting {

	public static void main(String[] args) {
	
		byte num1=35;
		short num2=num1;
//esitligin sol tarfi short, sag tarafi byte
//iki data turu farkli olduğu halde java itiraz etmiyor
//cunku atma yapilan variable in data türü (short)
//atanan degerin veri turunden (byte) buyuk oldugundan sorun olusmaz
	
System.out.println("num2 : " + num2);

int num3 = 52;
double num4=num3;
System.out.println("num4 : " + num4);

	}

}
