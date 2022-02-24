package day33_StringBuider;

public class C02_Delete {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder ("java candir can");
		sb.deleteCharAt(11);//sadece 11.indexdeki karakteri siler
		System.out.println(sb);
		sb.delete(11,14);//ilk index inclusive, ikinci index exclusive 
		System.out.println(sb);
		sb.delete(8, sb.length());
		System.out.println(sb);
		sb.delete(5,40 );//hata vermez ikinci index istedigin kadar çok hata vermiyor
		System.out.println(sb);
	}

}
