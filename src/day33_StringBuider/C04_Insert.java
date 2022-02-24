package day33_StringBuider;

public class C04_Insert {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder ("java ogrendik");
		
		//araya çok iyi ekleyelim
		sb.insert(4, "yi cok iyi");
		System.out.println(sb);
		sb.insert(7, "cok iyiyim",0,4);
		System.out.println(sb);
		String str="daha iyi ogrendik";
		sb.insert(15, str,0,5);
		System.out.println(sb);
	}

}
