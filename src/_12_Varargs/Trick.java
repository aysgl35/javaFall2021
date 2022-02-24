package _12_Varargs;

public class Trick {
	public static void main(String[] args) {

		int[] arr = {17, 23,6,34 };
		int []arr1= {80,90,23,45,67,89};
		System.out.println("array toplami : "+arrTopla(arr));
		System.out.println("varargs toplami :"+varargsTopla(23,6,34,17,35));
		System.out.println("varargs in array parametreli toplami :"+varargsTopla(arr));
		System.out.println("varargs in array1 in parametreli toplami :"+varargsTopla(arr1));
			//varargs array gibi davrandigi icin  herhangi bir arryi parametre olarak alabilir.
	}

//Array elemalanri toplayan method
	private static int arrTopla(int[] arr) {
		int topla = 0;
		for (int a : arr) {//herbir arr i a ya atiyor sonrada toplaya atýyor

			topla += a;
		}
		return topla;
	}

	// varargs elemanleri toplayan method
	private static int varargsTopla(int... i) {
		int toplam = 0;
		for (int a : i) {
			toplam += a;

		}
		return toplam;
	}
}
