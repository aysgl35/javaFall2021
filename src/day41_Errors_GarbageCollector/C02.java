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
				v.length();//null in uzunlugu olur burasi exception firlatir bu y�zden alttaki satir cali�maz
				result=result+"b";//bu satir calismaz v.length(); satirindan dolayi
			}catch (NullPointerException e) {
				result =result+"c";//bu satir cali�ir 
			}finally {// her durumda calisir
				result = result+"d";
				throw new Exception();// throw ile bir exceptionu konturollu olarak firlatiyorum ben istedigim icin
			}
		}catch (Exception e) {//�st satirda throw exception firlatildigi icin bu catch blogu cali�ir 
			result = result+"e";
		}
		return result;
	}

}
