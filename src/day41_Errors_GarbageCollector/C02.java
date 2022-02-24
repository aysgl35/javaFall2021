package day41_Errors_GarbageCollector;

public class C02 {

	public static void main(String[] args) {
	System.out.println(exception());//acde

	}

 @SuppressWarnings({ "finally", "null" })//(seprassvornings =uyarilari bastirmak
public static String exception() {
		String result="";
		String v=null;
		
		try {
			try {
				result=result+"a";//burasi calisir
				v.length();//null in uzunlugu olur burasi exception firlatir bu yüzden alttaki satir caliþmaz
				result=result+"b";//bu satir calismaz v.length(); satirindan dolayi
			}catch (NullPointerException e) {
				result =result+"c";//bu satir caliþir 
			}finally {// her durumda calisir
				result = result+"d";
				throw new Exception();// throw ile bir exceptionu konturollu olarak firlatiyorum ben istedigim icin
			}
		}catch (Exception e) {//üst satirda throw exception firlatildigi icin bu catch blogu caliþir 
			result = result+"e";
		}
		return result;
	}

}
