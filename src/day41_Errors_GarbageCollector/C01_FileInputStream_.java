package day41_Errors_GarbageCollector;

public class C01_FileInputStream_ {
  
	public static void main(String[] args) {
		//String str=''; //Her alti cizilen CTE de degildir EXCEPT�ON da degildir. 
//bu exception degildir bu sytex hatasi
	//FileNotFoundException : dosya bulunamad�
	//IOException : genel olarak b�t�n dosyalarla ilgili okuma veya yazma hatas�
	//Exception:b�t�n exception lar�n hatas�
	//Throwable:exception un babasi
		
		String s="";//
		try {//sorun yoksa try blogu cali�ir
			s+="t";//""+"t"="t" olur 
			
		}catch (Exception e) {// try calistigi icin catch blogu calismaz
			s+="c";//catch blogu exception olunca cali�ir
			
		}finally {//bu blog calisir.//try tek ba�ina calismaz ya catch olmali ya da finally olmayi
			// finally blogu herhalukarda cali�ir yani her durumda cali�ir
			s+="f";
		}
		s+="a";
		System.out.println(s);//tfa
		
		
		
		String p=null;
		try {
			p+="t";
			
		}catch (Exception e) {
			p+="c";
			
		}finally {
			p+="f";
		}
		p+="a";
		System.out.println(p);//nulltfa
	}

}
