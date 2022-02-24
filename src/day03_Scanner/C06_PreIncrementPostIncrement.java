package day03_Scanner;

public class C06_PreIncrementPostIncrement {

	public static void main(String[] args) {
		
	//preIncrement ve post increment sadece num++ veya num-- yazimi icin gecerlidir
		int num=10;
		num++;
		num++;
		num++;
		System.out.println(num);
		
	System.out.println(num++);	// 13 bu satirda iki islem var
								//bir artirma bir de yazdirma
	//önce artirmak sonra yazdirmak isterseniz ++num
	//önce yazdirmak sonra artirmak isterseniz sayi++
	System.out.println(num);//14
	System.out.println(++num);//15
	

	}

}
