package day41_Errors_GarbageCollector;

public class C01_FileInputStream_ {
  
	public static void main(String[] args) {
		//String str=''; //Her alti cizilen CTE de degildir EXCEPTÝON da degildir. 
//bu exception degildir bu sytex hatasi
	//FileNotFoundException : dosya bulunamadý
	//IOException : genel olarak bütün dosyalarla ilgili okuma veya yazma hatasý
	//Exception:bütün exception larýn hatasý
	//Throwable:exception un babasi
		
		String s="";//
		try {//sorun yoksa try blogu caliþir
			s+="t";//""+"t"="t" olur 
			
		}catch (Exception e) {// try calistigi icin catch blogu calismaz
			s+="c";//catch blogu exception olunca caliþir
			
		}finally {//bu blog calisir.//try tek baþina calismaz ya catch olmali ya da finally olmayi
			// finally blogu herhalukarda caliþir yani her durumda caliþir
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
