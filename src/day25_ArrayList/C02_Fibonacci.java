package day25_ArrayList;


import java.util.ArrayList;
import java.util.List;



public class C02_Fibonacci {

	public static void main(String[] args) {
		//verilen bir sayidan, fibonacci sayilarini bir list olarak kaydedelim.
		
		//1,1(1+1=2),2 (1+2=3),3(3+2=5),5(5+3=8),8,13,21,
		
		int sinir=100;
		
		List<Integer> fibonacci = new ArrayList <>();
		fibonacci.add(1);
		fibonacci.add(1);
		int sayi=0;
		while(sayi<sinir) {
			
			sayi=fibonacci.get(fibonacci.size()-2)+fibonacci.get(fibonacci.size()-1);
			if(sayi>=sinir) {
				break;
			}
			fibonacci.add(sayi);
			
			
			
			
		}
		//fibonacci.remove(fibonacci.size()-1);
		System.out.println(fibonacci);
		/*int num=11; // ilk kac terimi istedigimiz 
		int t1=0;
		int t2=1;
		System.out.println("****************************");
		for (int i = 1; i <=num; i++) {
			//System.out.print(t1+" ");
			int sum=t1+t2;
			t1=t2;
			t2=sum;
			System.out.print(t1+" ");
		}*/
	}

}
