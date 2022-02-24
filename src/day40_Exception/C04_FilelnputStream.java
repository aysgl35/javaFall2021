package day40_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_FilelnputStream {

	public static void main(String[] args) throws FileNotFoundException {
	//javada bir dosyaya ulasmak istedigimizde FileInputStream
	//classindan yardim aliriz
		FileInputStream fis=new FileInputStream("src/day40/yazi.txt");
		//java bu kodda olasi bir problem ön görüyor 
		//ve bu probleme karsi ne yapmasi gerektigini bize soruyor
		//yani alti cizilen her kod CTE degildir.
		
		//bunun icin iki durum sözkonusu
		//1- try catch kullanarak bu problemi HANDLE edip javanin yoluna devam etmesini saglayabilirz
		//2- eger dlosya okunamiyorsa kod calismasin istiyorsak olayin farkinda oldugumuzu
		//vesorumlulugun bizde oldugunu javaya söylemeliyiz
		
		System.out.println("görev tamalandi");

	}

}
